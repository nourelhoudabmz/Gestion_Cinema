package com.example.gestion_cinema.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
public class Projection {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Date dateprojection;
    private double prix;
    @ManyToOne
    private Film film;
    @ManyToOne
    private Salle salle;

    @OneToMany(mappedBy = "projection")
    private Collection<Ticket> tickets;

    @ManyToOne
    private Seance seance;
}
