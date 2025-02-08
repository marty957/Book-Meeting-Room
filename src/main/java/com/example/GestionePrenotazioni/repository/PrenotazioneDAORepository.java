package com.example.GestionePrenotazioni.repository;

import com.example.GestionePrenotazioni.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione,Long> {
    Prenotazione findByDate(LocalDate date);
}
