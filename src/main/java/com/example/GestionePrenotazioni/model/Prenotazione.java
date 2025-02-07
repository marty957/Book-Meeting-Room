package com.example.GestionePrenotazioni.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "prenotazioni")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Prenotazione {


    @Id
    @GeneratedValue
    private long idPrenotazione;
    @Column(nullable = false)
    private LocalDate date;


    @OneToMany(mappedBy = "booking")
    private List<Postazione> postazioni;

    @OneToMany(mappedBy = "prenotazione")
    private List<Utente> utenti;

    public Prenotazione(LocalDate date) {
        this.date = date;
    }
}
