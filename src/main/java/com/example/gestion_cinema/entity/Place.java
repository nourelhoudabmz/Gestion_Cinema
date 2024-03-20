package com.example.gestion_cinema.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
public class Place {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long id ;
    private int number;
    private double longitude, latitude, altitude;
    @ManyToOne
    private Salle salle;

    @OneToMany(mappedBy = "place")
    private Collection<Ticket> tickets;
}
