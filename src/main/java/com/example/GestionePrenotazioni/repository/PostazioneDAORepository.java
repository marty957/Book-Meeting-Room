package com.example.GestionePrenotazioni.repository;

import com.example.GestionePrenotazioni.enumaration.TipoDiPostazione;
import com.example.GestionePrenotazioni.model.Edificio;
import com.example.GestionePrenotazioni.model.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneDAORepository extends JpaRepository<Postazione,Long> {

    @Query("SELECT p FROM Postazione p WHERE p.tipoDiPostazione = :tipoDiPostazione AND p.edificio.city = :city")
    List<Postazione> findAllByTipoAndEdificio_City(@Param("tipoDiPostazione") TipoDiPostazione tipoDiPostazione, @Param("city") String city);

}
