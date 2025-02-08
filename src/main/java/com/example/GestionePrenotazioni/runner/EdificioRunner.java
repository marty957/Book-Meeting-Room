package com.example.GestionePrenotazioni.runner;

import com.example.GestionePrenotazioni.model.Edificio;
import com.example.GestionePrenotazioni.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(2)
public class EdificioRunner implements CommandLineRunner {

    @Autowired
    EdificioService edificioService;


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Edifio runner...");

/*        //Edifici di proprieta aziendali:

        Edificio edificioGiallo=edificioService.createGiallo();
        Edificio edificioVerdi=edificioService.createVerdi();
        Edificio edificioBianchi=edificioService.creareBianchi();

        //Edifici affittati per progetti stagionali:

        Edificio e1=edificioService.createEdificioAffittato();
        Edificio e2=edificioService.createEdificioAffittato();
        Edificio e3=edificioService.createEdificioAffittato();

        edificioService.insertEdificio(edificioGiallo);
        edificioService.insertEdificio(edificioVerdi);
        edificioService.insertEdificio(edificioBianchi);
        edificioService.insertEdificio(e1);
        edificioService.insertEdificio(e2);
        edificioService.insertEdificio(e3);*/

    }
}
