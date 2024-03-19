package com.example.gestion_cinema.repository;

import com.example.gestion_cinema.entity.Cinema;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}
