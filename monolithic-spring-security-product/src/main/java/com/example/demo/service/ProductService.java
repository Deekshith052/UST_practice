package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.entity.ProductEntity;
import com.example.demo.repo.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public List<ProductEntity> getAllProducts(){
		return repo.findAll();
	}
	
	public ProductEntity getProduct(int id) {
		Optional<ProductEntity> product=repo.findById(id);
		if(product.isPresent()) {
			return product.get();
		}
		return null;
	}
	
	public ProductEntity addProduct(ProductEntity product) {
		return repo.saveAndFlush(product);
	}
}
