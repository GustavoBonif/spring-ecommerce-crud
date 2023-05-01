package com.crudtest.ecommerceCrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudtest.ecommerceCrud.entities.Category;
import com.crudtest.ecommerceCrud.repositories.CategoryRepository;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

	@Autowired
	private CategoryRepository repository;
	
	@GetMapping
	public List<Category> findAll(){
		List<Category> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Category findById(@PathVariable Long id) {
		Category result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Category insert(@RequestBody Category category) {
		Category result = repository.save(category);
		return result;
	} 
}
