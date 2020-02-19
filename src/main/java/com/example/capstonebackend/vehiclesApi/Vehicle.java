package com.example.capstonebackend.vehiclesApi;

import com.example.capstonebackend.partsApi.Part;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "vehicles")
@Data

public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String year_range;

    @Column
    private String make;

    @Column
    private String model;

    @Column
    private String image;

    @ManyToMany(mappedBy = "vehicles")
    @JsonIgnoreProperties("vehicles")
    private List<Part> parts;

    public Vehicle() {}

}