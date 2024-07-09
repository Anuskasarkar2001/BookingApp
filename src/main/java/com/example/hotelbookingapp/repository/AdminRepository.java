package com.example.hotelbookingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotelbookingapp.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}