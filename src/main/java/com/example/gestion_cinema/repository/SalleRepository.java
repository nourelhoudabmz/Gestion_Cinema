package com.example.gestion_cinema.repository;

import com.example.gestion_cinema.entity.Salle;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository extends JpaRepository<Salle, Long> {
}
