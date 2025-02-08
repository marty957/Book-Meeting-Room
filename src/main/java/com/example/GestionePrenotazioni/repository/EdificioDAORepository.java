package com.example.GestionePrenotazioni.repository;

import com.example.GestionePrenotazioni.model.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioDAORepository extends JpaRepository<Edificio,Long> {

    Edificio findByName(String name);
}
