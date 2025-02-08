package com.example.GestionePrenotazioni.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "edifici")
@AllArgsConstructor
@Data
@Builder
public class Edificio {

    @Id
    @GeneratedValue
    private long idEdificio;
    private String name;
    private String address;
    private String city;

    @OneToMany(mappedBy = "edificio")
    List<Postazione> postazioni;

    public Edificio(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public Edificio(String name, String address, String city, List<Postazione> postazioni) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.postazioni = postazioni;
    }

    public Edificio() {
    }
}
