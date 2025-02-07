package com.example.GestionePrenotazioni.model;


import com.example.GestionePrenotazioni.enumaration.TipoDiPostazione;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "postazioni")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Postazione {

    @Id
    @GeneratedValue
    private long idPostazione;
    private String description;
    @Enumerated(EnumType.STRING)
    private TipoDiPostazione tipoDiPostazione;
    private long numberMaxOfPersons;

    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    @ManyToOne
    @JoinColumn(name = "prenotazione_id")
    private Prenotazione booking;

    public Postazione(String description, TipoDiPostazione tipoDiPostazione, long numberMaxOfPersons, Edificio edificio) {
        this.description = description;
        this.tipoDiPostazione = tipoDiPostazione;
        this.numberMaxOfPersons = numberMaxOfPersons;
        this.edificio = edificio;
    }

}
