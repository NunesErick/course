package com.course.portf.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.portf.entities.Product;
import com.course.portf.repositories.ProductRepository;
import com.course.portf.services.exceptions.ResourceNotFoundException;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
	public Product insertUser(Product prod) {
		return repository.save(prod);
	}
	
	public Product update(Long id,Product prod) {
		try {
			Product entity = repository.getOne(id);
			updateData(entity,prod);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	private void updateData(Product prod,Product uprod) {
		prod.setName(uprod.getName());
		prod.setPrice(uprod.getPrice());
		prod.setDescription(uprod.getDescription());
		prod.setImgUrl(uprod.getImgUrl());
	}
}
