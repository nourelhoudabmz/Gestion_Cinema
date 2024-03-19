package com.example.gestion_cinema.repository;

import com.example.gestion_cinema.entity.ville;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository extends JpaRepository<ville, Long> {
}
