package com.example.capstonebackend.vehiclesApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiclesService {

    @Autowired
    private final VehiclesRepository vehiclesRepository;

    public VehiclesService(VehiclesRepository vehiclesRepository) {
        this.vehiclesRepository = vehiclesRepository;
    }

    public List<Vehicle> getAllVehicle() {
        return this.vehiclesRepository.findAll();
    }

    public Optional<Vehicle> getOneVehicle(int id) {
        return vehiclesRepository.findById(id);
    }

    public Vehicle addOneVehicle(Vehicle newVehicle) {
        return vehiclesRepository.save(newVehicle);
    }

    public Vehicle updateOneVehicle(Vehicle updatedVehicle) {
        return vehiclesRepository.save(updatedVehicle);
    }

    public Integer removeOneVehicle(int id) {
        vehiclesRepository.deleteById(id);
//        return "Id " + id + " was removed";
        return id;
    }
}