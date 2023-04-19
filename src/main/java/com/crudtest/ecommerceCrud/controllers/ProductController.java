package com.crudtest.ecommerceCrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudtest.ecommerceCrud.entities.Product;
import com.crudtest.ecommerceCrud.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductRepository repository;
	
	@GetMapping
	public List<Product> findAll() {
		List<Product> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Product findById(@PathVariable Long id) {
		Product result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Product insert(@RequestBody Product product) {
		Product result = repository.save(product);
		return result;
	}
}
