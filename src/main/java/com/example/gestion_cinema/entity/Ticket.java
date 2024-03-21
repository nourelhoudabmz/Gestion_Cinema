package com.example.gestion_cinema.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nomclient;
    private double prix;
    @Column(unique = false, nullable = true)
    private Integer codePayement;
    private boolean reserve;
    @ManyToOne
    private Place place;
    @ManyToOne
    private Projection projection;
}
