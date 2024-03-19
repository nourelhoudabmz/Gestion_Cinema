package com.example.gestion_cinema.repository;

import com.example.gestion_cinema.entity.Projection;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectionRepository extends JpaRepository<Projection, Long> {
}
