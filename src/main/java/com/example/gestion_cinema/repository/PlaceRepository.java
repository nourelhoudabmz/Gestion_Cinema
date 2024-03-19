package com.example.gestion_cinema.repository;

import com.example.gestion_cinema.entity.Place;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
