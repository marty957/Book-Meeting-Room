package com.example.GestionePrenotazioni.runner;

import com.example.GestionePrenotazioni.model.Prenotazione;
import com.example.GestionePrenotazioni.service.PrenotazioniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
@Order(4)
public class PrenotazioneRunner implements CommandLineRunner {

    @Autowired
    PrenotazioniService prenotazioniService;
    @Override
    public void run(String... args) throws Exception {

        System.out.println("prenotazione runner...");

        Prenotazione p1=prenotazioniService.createPrenotazione(2, LocalDate.of(2025,1,31),2);
//        Prenotazione p2=prenotazioniService.createPrenotazione(2,LocalDate.of(2024,1,31),26);
//        Prenotazione p3=prenotazioniService.createPrenotazione(28,LocalDate.of(2024,1,31),6);
        Prenotazione p4=prenotazioniService.createPrenotazione(2, LocalDate.of(2025,1,31),2);
     /*   prenotazioniService.insertPrenotazione(p1);
        prenotazioniService.insertPrenotazione(p2);*/

      /*  Prenotazione p3=prenotazioniService.createFakePrenotazione(5,5);
        prenotazioniService.insertPrenotazione(p3);*/

    }
}
