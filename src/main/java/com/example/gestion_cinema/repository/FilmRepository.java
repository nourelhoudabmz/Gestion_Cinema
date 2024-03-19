package com.example.gestion_cinema.repository;

import com.example.gestion_cinema.entity.Film;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
