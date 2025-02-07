package com.example.GestionePrenotazioni.repository;

import com.example.GestionePrenotazioni.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDAORepository extends JpaRepository<Utente,Long> {
}
