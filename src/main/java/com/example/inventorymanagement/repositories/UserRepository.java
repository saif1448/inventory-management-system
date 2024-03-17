package com.example.inventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventorymanagement.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
