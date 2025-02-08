package com.example.GestionePrenotazioni.repository;

import com.example.GestionePrenotazioni.model.Edificio;
import com.example.GestionePrenotazioni.model.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneDAORepository extends JpaRepository<Postazione,Long> {

}
