package com.crudtest.ecommerceCrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudtest.ecommerceCrud.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
