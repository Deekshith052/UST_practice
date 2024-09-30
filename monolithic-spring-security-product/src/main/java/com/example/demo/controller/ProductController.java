package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.entity.ProductEntity;
import com.example.demo.service.ProductService;


@RestController
@RequestMapping("/api/product")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public List<ProductEntity> getAllProducts(){
		return service.getAllProducts();
	}
	
	@GetMapping("/{id}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ProductEntity getProduct(@PathVariable int id) {
		return service.getProduct(id);
	}
	
	@PostMapping
	public ProductEntity addProduct(ProductEntity product) {
		return service.addProduct(product);
	}
}
