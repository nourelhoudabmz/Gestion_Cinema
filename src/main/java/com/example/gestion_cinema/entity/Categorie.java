package com.example.gestion_cinema.entity;

import jakarta.persistence.*;

import java.util.Collection;
@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "categorie")
    private Collection<Film> films;
}
