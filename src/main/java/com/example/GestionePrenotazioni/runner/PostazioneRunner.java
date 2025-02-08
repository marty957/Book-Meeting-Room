package com.example.GestionePrenotazioni.runner;

import com.example.GestionePrenotazioni.model.Postazione;
import com.example.GestionePrenotazioni.service.EdificioService;
import com.example.GestionePrenotazioni.service.PostazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(3)
public class PostazioneRunner implements CommandLineRunner {

    @Autowired
    PostazioneService postazioneService;
    @Autowired
    EdificioService edificioService;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Postazione runner...");

/*
       //postazione per edificio Giallo:
        Postazione salaConferenzeG= postazioneService.createSalaConf(edificioService.getEdificio("Giallo"));
        Postazione salaConsiglioAmmG= postazioneService.createSalaConsAmministrazione(edificioService.getEdificio("Giallo"));
        Postazione salaRiunioniG= postazioneService.createSala(edificioService.getEdificio("Giallo"));
        Postazione salaRiunioniPiccolaG= postazioneService.createSalaSmall(edificioService.getEdificio("Giallo"));

        //postazione per edificio Verdi:
        Postazione salaConferenzeV= postazioneService.createSalaConf(edificioService.getEdificio("Verdi"));
        Postazione salaConsiglioAmmV= postazioneService.createSalaConsAmministrazione(edificioService.getEdificio("Verdi"));
        Postazione salaRiunioniV= postazioneService.createSala(edificioService.getEdificio("Verdi"));
        Postazione salaRiunioniPiccolaV= postazioneService.createSalaSmall(edificioService.getEdificio("Verdi"));

        //postazione per edificio Bianchi:
        Postazione salaConferenzeB= postazioneService.createSalaConf(edificioService.getEdificio("Bianchi"));
        Postazione salaConsiglioAmmB= postazioneService.createSalaConsAmministrazione(edificioService.getEdificio("Bianchi"));
        Postazione salaRiunioniB= postazioneService.createSala(edificioService.getEdificio("Bianchi"));
        Postazione salaRiunioniPiccolaB= postazioneService.createSalaSmall(edificioService.getEdificio("Bianchi"));

        //postazione per edifici Affittati:
        Postazione salaConferenze1= postazioneService.createSalaConf(edificioService.getById(4));
        Postazione salaConsiglioAmm1= postazioneService.createSalaConsAmministrazione(edificioService.getById(5));
        Postazione salaRiunioni1= postazioneService.createSala(edificioService.getById(6));
        Postazione salaRiunioniPiccola1= postazioneService.createSalaSmall(edificioService.getById(6));

        */
/*postazioneService.insertPostazione(salaConferenzeG);*//*

        postazioneService.insertPostazione(salaConsiglioAmmG);
        postazioneService.insertPostazione(salaRiunioniG);
        postazioneService.insertPostazione(salaRiunioniPiccolaG);

        postazioneService.insertPostazione(salaConferenzeV);
        postazioneService.insertPostazione(salaConsiglioAmmV);
        postazioneService.insertPostazione(salaRiunioniV);
        postazioneService.insertPostazione(salaRiunioniPiccolaV);

        postazioneService.insertPostazione(salaConferenzeB);
        postazioneService.insertPostazione(salaConsiglioAmmB);
        postazioneService.insertPostazione(salaRiunioniB);
        postazioneService.insertPostazione(salaRiunioniPiccolaB);


        postazioneService.insertPostazione(salaConferenze1);
        postazioneService.insertPostazione(salaConsiglioAmm1);
        postazioneService.insertPostazione(salaRiunioni1);
        postazioneService.insertPostazione(salaRiunioniPiccola1);

*/

    }
}
