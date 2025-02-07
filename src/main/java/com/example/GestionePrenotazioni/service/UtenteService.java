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

    public void insertAdmin(Utente u) {
        db.save(u);
        System.out.println("Admin inserito in DB correttamente");
    }
    public void insertFakeUtente(Utente u) {
        db.save(u);
        System.out.println("Utente Fake inserito in DB correttamente");
    }
    public void insertCostumUtente(Utente u) {
        db.save(u);
        System.out.println("Utente inserito in DB correttamente");
    }
    public void upDateAdmin(Utente u) {
        db.save(u);
        System.out.println("Admin aggiornato in DB correttamente");
    }
    public void upDateFakeUtente(Utente u) {
        db.save(u);
        System.out.println("Utente Fake aggiornato in DB correttamente");
    }
    public void upDateCostumUtente(Utente u) {
        db.save(u);
        System.out.println("Utente aggiornato in DB correttamente");
    }
  public void deleteAdmin(Utente u){
        db.delete(u);
        System.out.println("Admin eliminato da DB");
    }
    public void deleteFakeUtente(Utente u){
        db.delete(u);
        System.out.println("Utente Fake eliminato da DB");
    }
    public void deleteCostumUtente(Utente u){
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
