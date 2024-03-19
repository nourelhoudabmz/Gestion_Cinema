package com.example.gestion_cinema.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Data
public class Seance {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date heureDebut;
}
