package com.example.capstonebackend.partsApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/parts")
public class PartsController {

    @Autowired
    private final PartsService partsService;

    public PartsController(PartsService partsService, EntityManager em) {
        this.partsService = partsService;
    }

    @GetMapping
    public List<Part> getAllParts() {
        return this.partsService.getAllParts();
    }

    @GetMapping("/{id}")
    public Part getOnePart(@PathVariable int id) {
        Part part = partsService.getOnePart(id).orElseThrow(IllegalArgumentException::new);
        return part;
    }

    @PostMapping
    public Part addOnePart(@RequestBody Part newPart) {
        if(newPart.getPart_name() == null
                || newPart.getPart_type() == null
                || newPart.getImage() == null) {
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " +
                    "before API call is made.");
        }
        return partsService.addOnePart(newPart);
    }

    @PatchMapping("/{id}")
    public Part updateOnePart(@RequestBody Part updatedPart) {
        Part part = partsService.getOnePart(updatedPart.getId()).orElseThrow(IllegalArgumentException::new);
        return partsService.updateOnePart(updatedPart);
    }

    @DeleteMapping("/{id}")
    public Integer removeOnePart(@PathVariable int id) {
        Part part = partsService.getOnePart(id).orElseThrow(IllegalArgumentException::new);
        return partsService.removeOnePart(id);
    }
}