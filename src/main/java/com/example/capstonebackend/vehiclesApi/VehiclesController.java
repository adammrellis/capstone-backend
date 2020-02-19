package com.example.capstonebackend.vehiclesApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicles")
@CrossOrigin
public class VehiclesController {

    @Autowired
    private final VehiclesService vehiclesService;

    public VehiclesController(VehiclesService vehiclesService) {
        this.vehiclesService = vehiclesService;
    }

    @GetMapping
    public List<Vehicle> getAllVehicle() {
        return this.vehiclesService.getAllVehicle();
    }

    @GetMapping("/{id}")
    public Vehicle getOneVehicle(@PathVariable int id) {
        Vehicle vehicle = vehiclesService.getOneVehicle(id).orElseThrow(IllegalArgumentException::new);
        return vehicle;
    }

    @PostMapping
    public Vehicle addOnePart(@RequestBody Vehicle newVehicle) {
        if(newVehicle.getYear_range() == null
                || newVehicle.getMake() == null
                || newVehicle.getModel() == null
                || newVehicle.getImage() == null) {
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " +
                    "before API call is made.");
        }
        return vehiclesService.addOneVehicle(newVehicle);
    }

    @PatchMapping("/{id}")
    public Vehicle updateOneVehicle(@RequestBody Vehicle updatedVehicle) {
        Vehicle vehicle = vehiclesService.getOneVehicle(updatedVehicle.getId()).orElseThrow(IllegalArgumentException::new);
        return vehiclesService.updateOneVehicle(updatedVehicle);
    }

    @DeleteMapping("/{id}")
    public Integer removeOneVehicle(@PathVariable int id) {
        Vehicle vehicle = vehiclesService.getOneVehicle(id).orElseThrow(IllegalArgumentException::new);
        return vehiclesService.removeOneVehicle(id);
    }
}