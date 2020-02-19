package com.example.capstonebackend.partsApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsService {

    @Autowired
    private final PartsRepository partsRepository;

    public PartsService(PartsRepository partsRepository) {
        this.partsRepository = partsRepository;
    }

    public List<Part> getAllParts() {
        return this.partsRepository.findAll();
    }

    public Optional<Part> getOnePart(int id) {
        return partsRepository.findById(id);
    }

    public Part addOnePart(Part newPart) {
        return partsRepository.save(newPart);
    }

    public Part updateOnePart(Part updatedPart) {
        return partsRepository.save(updatedPart);
    }

    public Integer removeOnePart(int id) {
        partsRepository.deleteById(id);
        //return "Id " + id + " was removed";
        return id;
    }
}