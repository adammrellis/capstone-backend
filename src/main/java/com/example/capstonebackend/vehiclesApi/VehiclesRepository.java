package com.example.capstonebackend.vehiclesApi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiclesRepository extends JpaRepository<Vehicle, Integer> {
}