package com.example.GestionePrenotazioni.service;


import com.example.GestionePrenotazioni.Exception.PostazioneInesistente;
import com.example.GestionePrenotazioni.Exception.PrenotazioneInvalida;
import com.example.GestionePrenotazioni.Exception.UtenteInesistente;
import com.example.GestionePrenotazioni.model.Postazione;
import com.example.GestionePrenotazioni.model.Prenotazione;
import com.example.GestionePrenotazioni.model.Utente;
import com.example.GestionePrenotazioni.repository.PostazioneDAORepository;
import com.example.GestionePrenotazioni.repository.PrenotazioneDAORepository;
import com.example.GestionePrenotazioni.repository.UtenteDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioniService {

    @Autowired
    PrenotazioneDAORepository db;
    @Autowired
    PostazioneDAORepository postazioneDAORepository;
    @Autowired
    UtenteDAORepository utenteDAORepository;

    @Autowired @Qualifier("prenotazioni") ObjectProvider<Prenotazione> prenotazioneProvider;
    @Autowired @Qualifier ("prenotazioniFake") ObjectProvider<Prenotazione> prenotazioneFakeProvider;


    public Prenotazione createPrenotazione(long idpos, LocalDate data, long idUtente)  {

        Postazione postazione=postazioneDAORepository.findById(idpos).orElseThrow(()->new PostazioneInesistente("codice postazione invalido"));
        Utente u = utenteDAORepository.findById(idUtente).orElseThrow(()->new UtenteInesistente("codice utente inesistente"));

       if(db.existsByPostazioneAndDate(postazione,data)){
           throw new PrenotazioneInvalida("la postazione è gia prenotata per la data indicata");
       }
        Prenotazione p=prenotazioneProvider.getObject();
       p.addPostazione(postazione);
       p.setDate(data);
       p.setUtente(u);
       return p;
    }


// METEDO CREATO MA MAI UTILIZZATO PERCHE MI CREAVA DEI BUG CHE NON SONO RIUSCITA A RISOLVERE,
// HO TENUTO IL CODICE PERCHE' PER CREARE SIA QUESTO METODO CHE IL BEAN DI RIFERIMENTO CI HO MESSO UN PO
// (SOPRATTUTO PER IL BEAN CON LA DATA RANDOM) E MI DISPIACEVA BUTTARE IL LAVORO, ANCHE SE INCOMPIUTO.
    public Prenotazione createFakePrenotazione(long idpos,long idUtente){

        Postazione postazione=postazioneDAORepository.findById(idpos).orElseThrow(()->new PostazioneInesistente("codice postazione invalido"));
        Utente u = utenteDAORepository.findById(idUtente).orElseThrow(()->new UtenteInesistente("codice utente inesistente"));
        Prenotazione p=prenotazioneFakeProvider.getObject();
        LocalDate data=p.getDate();

        if(db.existsByPostazioneAndDate(postazione,data)){
            try {
                throw new PrenotazioneInvalida("la postazione è gia prenotata per la data indicata");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        p.addPostazione(postazione);
        p.setUtente(u);
        return p;
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
