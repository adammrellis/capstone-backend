package com.example.capstonebackend.vehiclesApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/vehicles")
@CrossOrigin
public class VehiclesController {

    @Autowired
    private final VehiclesService vehiclesService;

    private final EntityManager em;

    public VehiclesController(VehiclesService vehiclesService, EntityManager em) {
        this.vehiclesService = vehiclesService;
        this.em = em;
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
    @Transactional
    public Integer removeOneVehicle(@PathVariable int id) {
        Vehicle vehicle = vehiclesService.getOneVehicle(id).orElseThrow(IllegalArgumentException::new);

        Query q1 = em.createNativeQuery("delete from vehicles_parts where vehicle_id = ?");
        q1.setParameter(1, id);
        em.joinTransaction();
        q1.executeUpdate();

        return vehiclesService.removeOneVehicle(id);
    }
}