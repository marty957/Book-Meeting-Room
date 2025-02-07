package com.example.GestionePrenotazioni.service;


import com.example.GestionePrenotazioni.model.Postazione;
import com.example.GestionePrenotazioni.repository.PostazioneDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    PostazioneDAORepository db;

    @Autowired @Qualifier("sale_conferenze") private ObjectProvider<Postazione> salaConfProvider;
    @Autowired @Qualifier("sala_consiglio_amministrazione") private ObjectProvider<Postazione> salaCoonsiglioAmmProvider;
    @Autowired @Qualifier("sala_riunioni") private ObjectProvider<Postazione> salaProvider;
    @Autowired @Qualifier("sala_riunioni_piccola") private ObjectProvider<Postazione> salaPiccola;


    public Postazione createSalaConf(){
        return salaConfProvider.getObject();
    }

    public Postazione createSalaConsAmministrazione(){
        return salaCoonsiglioAmmProvider.getObject();
    }


    public Postazione createSala(){
        return salaProvider.getObject();
    }


    public Postazione createSalaSmall(){
        return salaPiccola.getObject();
    }


    public void insertPostazione(Postazione p){
        db.save(p);
        System.out.println("Postazione aggiunta in DB");
    }
    public void upDatePostazione(Postazione p){
        db.save(p);
        System.out.println("Postazione aggiornata in DB");
    }
    public void deletePostazione(Postazione p){
        db.delete(p);
        System.out.println("Postazione eliminata in DB");
    }

    public Postazione findBYiD(long id){
        return db.findById(id).get();
    }

    public List<Postazione> getAll(){
        return db.findAll();
    }





}
