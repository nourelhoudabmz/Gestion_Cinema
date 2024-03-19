package com.example.gestion_cinema.repository;

import com.example.gestion_cinema.entity.Seance;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository extends JpaRepository<Seance, Long> {
}
