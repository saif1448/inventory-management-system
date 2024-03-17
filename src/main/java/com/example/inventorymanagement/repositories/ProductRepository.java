package com.example.inventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventorymanagement.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
