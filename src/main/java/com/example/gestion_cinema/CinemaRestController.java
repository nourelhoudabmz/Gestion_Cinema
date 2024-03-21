package com.example.gestion_cinema;


import com.example.gestion_cinema.entity.Film;
import com.example.gestion_cinema.entity.Ticket;
import com.example.gestion_cinema.repository.FilmRepository;
import com.example.gestion_cinema.repository.TicketRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


@RestController
public class CinemaRestController {
    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private TicketRepository ticketRepository;
   @GetMapping(path="/imageFilm/{id}",produces= MediaType.IMAGE_JPEG_VALUE)
    public byte[] image(@PathVariable (name="id") Long id) throws Exception{
       Film f=filmRepository.findById(id).get();
       String photoName=f.getPhoto();
       File file=new File(System.getProperty("user.home")+"/IdeaProjects/cinema/images/"+photoName);
       Path path= Paths.get(file.toURI());
       return Files.readAllBytes(path);
   }
   @PostMapping("/payerTickets")
   @Transactional
   public List<Ticket> payerTickets(@RequestBody TicketFrom ticketFrom){
List<Ticket> listTickets=new ArrayList<>();
       ticketFrom.getTickets().forEach(idTicket->{
           System.out.println(idTicket);
    Ticket ticket=ticketRepository.findById(idTicket).get();

    ticket.setNomclient(ticketFrom.getNomClient());
    ticket.setReserve(true);
    ticketRepository.save(ticket);
    listTickets.add(ticket);
});
       return listTickets;
   }

}
@Data
class TicketFrom{
    private String nomClient;
    private  List<Long> tickets=new ArrayList<>();

}
