package com.example.GestionePrenotazioni.repository;

import com.example.GestionePrenotazioni.model.Postazione;
import com.example.GestionePrenotazioni.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneDAORepository extends JpaRepository<Prenotazione,Long> {

    boolean existsByDateAndPostazione(LocalDate date, Postazione postazione);
}
