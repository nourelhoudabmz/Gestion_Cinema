package com.example.gestion_cinema.repository;

import com.example.gestion_cinema.entity.Categorie;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoryRepository extends JpaRepository<Categorie, Long> {
}
