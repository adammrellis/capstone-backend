package com.example.capstonebackend.partsApi;

import com.example.capstonebackend.vehiclesApi.Vehicle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "parts")
@Data

public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String part_name;

    @Column
    private String part_type;

    @Column
    private String image;

    @Column
    private Boolean in_cart;

    @Column
    private Integer price;

    @ManyToMany

    @JoinTable(
            name = "vehicles_parts",
            joinColumns = @JoinColumn(name = "part_id"),
            inverseJoinColumns = @JoinColumn(name = "vehicle_id"))
    @JsonIgnoreProperties("parts")
    private List<Vehicle> vehicles;

    public Part() {}

}