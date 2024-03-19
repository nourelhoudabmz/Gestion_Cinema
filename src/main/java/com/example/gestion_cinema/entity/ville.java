package com.example.gestion_cinema.entity;

import jakarta.persistence.*;

import java.util.Collection;
@Entity
public class ville {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double longitude, latitude, altitude;
    @OneToMany(mappedBy = "ville")
    private Collection<Cinema> cinemas;
}
