package com.example.GestionePrenotazioni.Configuration;


import com.example.GestionePrenotazioni.model.Edificio;
import com.example.GestionePrenotazioni.model.Utente;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Locale;

@Configuration
@PropertySource("applcation.properies")
public class BookingConfiguration {

    @Value("${user.admin.username}") private String adminUsername;
    @Value("${user.admin.fullName}") private String adminName;
    @Value("${user.admin.email}") private String adminEmail;

    // BEAN PER UTENTE

    @Bean
    @Scope("singleton")
    public Utente adminUser(){
        return new Utente(adminUsername,adminName,adminEmail);
    }

    @Bean
    @Scope("prototype")
    public Utente fakeUser(){
        Faker fake = Faker.instance( new Locale("it-IT"));
        return new Utente(fake.name().username(),fake.name().fullName(),fake.internet().emailAddress());
    }

    @Bean
    @Scope("prototype")
    public Utente costumUtente(){
        return new Utente();
    }

    //BEAN PER EDIFICIO

    @Bean(name= "edificio_giallo")
    @Scope("prototype")
    public Edificio edificioGallo(){
        Faker fake = Faker.instance( new Locale("it-IT"));
        return new Edificio("Gallo",fake.address().streetAddress(),fake.address().city());
    }
    @Bean(name= "edificio_Verdi")
    @Scope("prototype")
    public Edificio edificioVerdi(){
        Faker fake = Faker.instance( new Locale("it-IT"));
        return new Edificio("Verdi",fake.address().streetAddress(),fake.address().city());
    }
    @Bean(name= "edificio_Bianchi")
    @Scope("prototype")
    public Edificio edificioBianchi(){
        Faker fake = Faker.instance( new Locale("it-IT"));
        return new Edificio("Bianchi",fake.address().streetAddress(),fake.address().city());
    }

    @Bean(name = "edificio_affittato")
    @Scope("prototype")
    public Edificio edificioAffittato(){
        Faker fake = Faker.instance( new Locale("it-IT"));
        return new Edificio(fake.name().name(),fake.address().streetAddress(),fake.address().city());
    }
    // BEAN PER POSTAZIONI





}
