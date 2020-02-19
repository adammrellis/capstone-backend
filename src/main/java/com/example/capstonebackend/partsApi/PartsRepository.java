package com.example.capstonebackend.partsApi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartsRepository extends JpaRepository<Part, Integer> {
}