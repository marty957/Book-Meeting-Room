package com.example.GestionePrenotazioni.service;


import com.example.GestionePrenotazioni.model.Edificio;
import com.example.GestionePrenotazioni.repository.EdificioDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioService {
    @Autowired
    EdificioDAORepository db;

    @Autowired @Qualifier("edificio_giallo") private ObjectProvider<Edificio> gialloProvider;
    @Autowired @Qualifier("edificio_Verdi") private ObjectProvider<Edificio> verdiProvider;
    @Autowired @Qualifier("edificio_Bianchi") private ObjectProvider<Edificio> bianchiProvider;
    @Autowired @Qualifier("edificio_affittato") private ObjectProvider<Edificio> edificioAffittatoProvider;

    public Edificio createGiallo(){
        return gialloProvider.getObject();
    }

    public Edificio createVerdi(){
        return verdiProvider.getObject();
    }

    public Edificio creareBianchi(){
        return  bianchiProvider.getObject();
    }

    public Edificio createEdificioAffittato(){
        return edificioAffittatoProvider.getObject();

    }

    public void insertEdificio(Edificio e){
        db.save(e);
        System.out.println("edificio inserito in db correttamente");
    }

    public void upDateEdificio(Edificio e){
        db.save(e);
        System.out.println("edificio aggiornato correttamente in DB");
    }

    public void deleteEdificio(Edificio e){
        db.delete(e);
        System.out.println("edificio eliminato in DB");
    }

    public Edificio getEdificio(String name){
        Edificio e= db.findByName(name);
        return e;
    }
    public Edificio getById(long id){
        return db.findById(id).get();
    }
   public List<Edificio> getAllEdifici(){
        return db.findAll();
}




}
