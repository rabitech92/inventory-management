package com.example.inventorymanagement.repository;

import com.example.inventorymanagement.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Long> {
    Optional<MyUser> findByUsername(String username);
}
