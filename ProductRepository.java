package com.deepti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepti.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
....
	
}
