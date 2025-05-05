package com.example.faqBackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principale per l'avvio dell'applicazione Spring Boot.
 * Utilizza l'annotazione @SpringBootApplication che abilita:
 * - Scansione dei componenti (component scanning)
 * - Configurazione automatica (auto-configuration)
 * - Configurazione tramite componenti dichiarati (configuration)
 */
@SpringBootApplication
public class FaqBackEndApplication {

    /**
     * Metodo main che avvia l'applicazione Spring Boot.
     * @param args eventuali argomenti passati da linea di comando
     */
    public static void main(String[] args) {
        SpringApplication.run(FaqBackEndApplication.class, args);
    }
}