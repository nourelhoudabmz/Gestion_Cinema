package com.example.gestion_cinema.repository;

import com.example.gestion_cinema.entity.Ticket;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
