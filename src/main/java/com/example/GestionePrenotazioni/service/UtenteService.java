package com.example.GestionePrenotazioni.service;


import com.example.GestionePrenotazioni.model.Utente;
import com.example.GestionePrenotazioni.repository.UtenteDAORepository;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtenteService {

    @Autowired UtenteDAORepository db;

    @Autowired @Qualifier ("admin") ObjectProvider<Utente> adminProvider;
    @Autowired @Qualifier ("fakeUtente") ObjectProvider<Utente> fakeUtenteProvider;
    @Autowired @Qualifier ("costumUtente") ObjectProvider<Utente> costumUtenteProvider;

    public Utente createAdmin(){
        return adminProvider.getObject();
    }
    public Utente createFakeUtente(){
        return fakeUtenteProvider.getObject();
    }
    public Utente createCostumUtente(){
        return costumUtenteProvider.getObject();
    }

    public void insertUtente(Utente u) {
        db.save(u);
        System.out.println("Utente inserito in DB correttamente");
    }

    public void upDateUtente(Utente u) {
        db.save(u);
        System.out.println("Utente aggiornato in DB correttamente");
    }

    public void deleteUtente(Utente u){
        db.delete(u);
        System.out.println("Utente eliminato da DB");
    }

    public Utente getUtente(long id){
        return db.findById(id).get();
    }

    public List<Utente> getAll(){
        return db.findAll();
    }


}
