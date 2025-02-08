package com.example.GestionePrenotazioni.service;


import com.example.GestionePrenotazioni.model.Prenotazione;
import com.example.GestionePrenotazioni.repository.PrenotazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioniService {

    @Autowired
    PrenotazioneDAORepository db;

    @Autowired @Qualifier("prenotazioni") ObjectProvider<Prenotazione> prenotazioneProvider;
    @Autowired @Qualifier ("prenotazioniFake") ObjectProvider<Prenotazione> prenotazioneFakeProvider;


    public Prenotazione createPrenotazione(){

        return prenotazioneProvider.getObject();
    }

    public Prenotazione createFakePrenotazione(){
        return prenotazioneFakeProvider.getObject();
    }

    public void insertPrenotazione(Prenotazione pr){
        db.save(pr);
        System.out.println("Prenotazione inserita nel DB");
    }

    public void upDatePrenotazione(Prenotazione pr){
        db.save(pr);
        System.out.println("Prenotazione aggiornata nel DB");
    }
    public void deletePrenotazione(Prenotazione pr){
        db.delete(pr);
        System.out.println("Prenotazione eliminata dal DB");
    }

    public Prenotazione getBYid(long id){
        return db.findById(id).get();
    }

    public List<Prenotazione> findAll(){
        return db.findAll();
    }
}
