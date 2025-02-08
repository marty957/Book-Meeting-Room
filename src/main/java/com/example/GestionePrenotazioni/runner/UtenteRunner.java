package com.example.GestionePrenotazioni.runner;

import com.example.GestionePrenotazioni.model.Utente;
import com.example.GestionePrenotazioni.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(1)
public class UtenteRunner implements CommandLineRunner {

    @Autowired
    UtenteService utenteService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Utente Runner......");
/*
        Utente admin=utenteService.createAdmin();

        Utente fake1=utenteService.createFakeUtente();
        Utente fake2=utenteService.createFakeUtente();
        Utente fake3=utenteService.createFakeUtente();
        Utente fake4=utenteService.createFakeUtente();
        Utente fake5=utenteService.createFakeUtente();

        Utente costum1=utenteService.createCostumUtente().builder().username("Segreteria-Uffico-aquisti").
                fullname("Maddalena Rocchi").email("segreteria@example.com").build();
        Utente costum2=utenteService.createCostumUtente().builder().username("Segreteria-Uffico-vendite").
                fullname("Francesca Baldi").email("segreteriaVendite@example.com").build();
        Utente costum3=utenteService.createCostumUtente().builder().username("Segreteria_clienti").
                fullname("Marco Gaudi").email("segreteriaAziandale@example.com").build();


        utenteService.insertUtente(admin);
        utenteService.insertUtente(fake1);
        utenteService.insertUtente(fake2);
        utenteService.insertUtente(fake3);
        utenteService.insertUtente(fake4);
        utenteService.insertUtente(fake5);
        utenteService.insertUtente(costum1);
        utenteService.insertUtente(costum2);
        utenteService.insertUtente(costum3);*/


    }
}

