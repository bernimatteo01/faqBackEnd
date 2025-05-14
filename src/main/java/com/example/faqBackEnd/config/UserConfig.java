package com.example.faqBackEnd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Configurazione dell'utente admin e del sistema di autenticazione in memoria.
 * Questa configurazione è usata da Spring Security per verificare le
 * credenziali.
 */
@Configuration
public class UserConfig {

    /**
     * Crea un utente admin in memoria con username "admin" e password "admin123"
     * (criptata).
     * 
     * @param passwordEncoder il bean PasswordEncoder usato per criptare la password
     * @return un UserDetailsService con l'utente configurato
     */
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        var user = User.builder()
                .username("admin") // Username per il login
                .password(passwordEncoder.encode("admin123")) // Password criptata
                .roles("ADMIN") // Ruolo assegnato
                .build();

        // Restituisce un gestore utenti in memoria con il solo admin
        return new InMemoryUserDetailsManager(user);
    }

    /**
     * Definisce il tipo di encoder usato per criptare le password.
     * BCrypt è uno standard sicuro e raccomandato.
     *
     * @return un'istanza di BCryptPasswordEncoder
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
