package com.example.gestion_cinema.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
public class Salle {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name ;
    private int nombreplace;

    @ManyToOne
    private Cinema cinema ;

    @OneToMany(mappedBy = "salle")
    private Collection<Place> places;


    @OneToMany(mappedBy = "salle")
    private Collection<Projection> projections;
}
