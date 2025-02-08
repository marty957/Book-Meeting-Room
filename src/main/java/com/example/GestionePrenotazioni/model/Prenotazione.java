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
    @Column(nullable = false,unique = true)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name="postazione_id")
    private Postazione postazione;

    public Prenotazione(LocalDate date) {
        this.date = date;
    }
}
