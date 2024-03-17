package com.example.inventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventorymanagement.models.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
