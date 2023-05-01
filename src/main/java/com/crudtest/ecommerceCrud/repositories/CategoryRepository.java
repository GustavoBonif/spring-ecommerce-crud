package com.crudtest.ecommerceCrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudtest.ecommerceCrud.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
