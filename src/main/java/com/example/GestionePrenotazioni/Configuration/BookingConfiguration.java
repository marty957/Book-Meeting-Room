package com.example.GestionePrenotazioni.Configuration;


import com.example.GestionePrenotazioni.enumaration.TipoDiPostazione;
import com.example.GestionePrenotazioni.model.Edificio;
import com.example.GestionePrenotazioni.model.Postazione;
import com.example.GestionePrenotazioni.model.Prenotazione;
import com.example.GestionePrenotazioni.model.Utente;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Configuration
@PropertySource("applcation.properies")
public class BookingConfiguration {

    @Value("${user.admin.username}") private String adminUsername;
    @Value("${user.admin.fullName}") private String adminName;
    @Value("${user.admin.email}") private String adminEmail;

    // BEAN PER UTENTE

    @Bean(name = "admin")
    @Scope("singleton")
    public Utente adminUser(){
        return new Utente(adminUsername,adminName,adminEmail);
    }

    @Bean(name = "fakeUtente")
    @Scope("prototype")
    public Utente fakeUser(){
        Faker fake = Faker.instance( new Locale("it-IT"));
        return new Utente(fake.name().username(),fake.name().fullName(),fake.internet().emailAddress());
    }

    @Bean(name = "costumUtente")
    @Scope("prototype")
    public Utente costumUtente(){
        return new Utente();
    }

    //BEAN PER EDIFICIO

    @Bean(name= "edificio_giallo")
    public Edificio edificioGiallo(){
        return new Edificio("Giallo","Via roma 17","Roma");
    }
    @Bean(name= "edificio_Verdi")
    public Edificio edificioVerdi(){
        Faker fake = Faker.instance( new Locale("it-IT"));
        return new Edificio("Verdi","via venezia 25","Nettuno");
    }
    @Bean(name= "edificio_Bianchi")
    public Edificio edificioBianchi(){
        Faker fake = Faker.instance( new Locale("it-IT"));
        return new Edificio("Bianchi","Via della Reppublica 1","Perugia");
    }

    @Bean(name = "edificio_affittato")
    @Scope("prototype")
    public Edificio edificioAffittato(){
        Faker fake = Faker.instance( new Locale("it-IT"));
        return new Edificio(fake.name().name(),fake.address().streetAddress(),fake.address().city());
    }
    // BEAN PER POSTAZIONI


    @Bean(name = "sale_conferenze")
    @Scope("prototype")
    public Postazione meetingRoomBig(){
        return new Postazione("Sala conferenze", TipoDiPostazione.SALA_RUINIONI,200);
    }

    @Bean(name = "sala_consiglio_amministrazione")
    @Scope("prototyope")
    public Postazione meetingRoomMediumBig(){
        return new Postazione("Sala riunioni Consiglio di amministarzione",
                TipoDiPostazione.SALA_RUINIONI,120);

    }
    @Bean(name = "sala_riunioni")
    @Scope("prototyope")
    public Postazione meetingRoomMedium(){
        return new Postazione("Sala riunione Annuali/Mensili con attrezzature audio visive",
                TipoDiPostazione.ONPENSPACE,50);

    }
    @Bean(name = "sala_riunioni_piccola")
    @Scope("prototyope")
    public Postazione meetingRoomSmall(){
        return new Postazione("Sala riunione ad uso interno",
                TipoDiPostazione.PRIVATO,20);

    }

    // BEAN PER PRENOTAZIONI;

    @Bean(name = "prenotazioni")
    @Scope("prototype")
    public Prenotazione prenotazione(){
        return new Prenotazione(LocalDate.now());
    }

    @Bean(name = "prenotazioniFake")
    @Scope("prototype")
    public Prenotazione prenotazioneFake(){
         // creazione data random, solo per popolare il DB
        long start=LocalDate.of(1998,01,01).toEpochDay();
        long end=LocalDate.of(2025,02,06).toEpochDay();
        long randomDays= ThreadLocalRandom.current().nextLong(start,end);
        LocalDate randomDate= LocalDate.ofEpochDay(randomDays);

        return new Prenotazione(randomDate);

    }










}
