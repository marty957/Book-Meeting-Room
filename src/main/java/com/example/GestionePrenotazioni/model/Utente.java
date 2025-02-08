package com.example.GestionePrenotazioni.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "utenti")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Utente {

    @Id
    @GeneratedValue
    private long idUtente;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String fullname;
    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "utente")

    private List<Prenotazione> prenotazione;

    public Utente(String username, String fullname, String email) {
        this.username = username;
        this.fullname = fullname;
        this.email = email;
    }
}
