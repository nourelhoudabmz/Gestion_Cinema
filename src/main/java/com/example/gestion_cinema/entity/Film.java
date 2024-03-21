package com.example.gestion_cinema.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    private String photo;
    @OneToMany(mappedBy = "film")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Projection> projections;

    @ManyToOne
    private Categorie categorie;
}
