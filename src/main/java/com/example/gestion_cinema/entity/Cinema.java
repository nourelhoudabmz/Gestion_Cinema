package com.example.gestion_cinema.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
public class Cinema {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id;
        private String name;
        private double longitude, latitude, altitude;
        private int nombreSalles;
        @OneToMany(mappedBy = "cinema")
    private Collection<Salle> salles;
        @ManyToOne
    private Ville ville;

}

