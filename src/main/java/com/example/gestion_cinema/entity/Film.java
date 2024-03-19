package com.example.gestion_cinema.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
public class Film {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String decription;
    private String realisateur;
    private Date dateSortie;
    private double durees;
    @OneToMany(mappedBy = "film")
    private Collection<Projection> projections;

    @ManyToOne
    private Categorie categorie;
}
