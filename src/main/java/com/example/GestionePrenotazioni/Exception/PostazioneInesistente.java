package com.example.GestionePrenotazioni.Exception;

public class PostazioneInesistente extends RuntimeException {
    public PostazioneInesistente(String message) {
        super(message);
    }
}
