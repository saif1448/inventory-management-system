package com.example.inventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventorymanagement.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
