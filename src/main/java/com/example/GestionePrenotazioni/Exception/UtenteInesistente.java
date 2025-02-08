package com.example.GestionePrenotazioni.Exception;

public class UtenteInesistente extends RuntimeException {
    public UtenteInesistente(String message) {
        super(message);
    }
}
