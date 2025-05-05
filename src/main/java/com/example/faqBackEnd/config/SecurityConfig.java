package com.example.faqBackEnd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Classe di configurazione della sicurezza per l'applicazione.
 * Definisce le regole di accesso alle API utilizzando Spring Security.
 */
@Configuration
public class SecurityConfig {

    /**
     * Definizione del filtro di sicurezza principale per le richieste HTTP.
     * @param http Oggetto HttpSecurity fornito da Spring per configurare le regole.
     * @return il filtro di sicurezza configurato.
     * @throws Exception in caso di errore nella configurazione.
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            // Disabilita la protezione CSRF (utile per API REST stateless)
            .csrf(csrf -> csrf.disable())

            // Definizione delle regole di autorizzazione
            .authorizeHttpRequests(auth -> auth
                // Permette accesso pubblico a tutte le API che iniziano con /api/faq/
                .requestMatchers("/api/faq/**").permitAll()

                // Richiede autenticazione per tutte le richieste a /api/admin/
                .requestMatchers("/api/admin/**").authenticated()

                // Qualsiasi altra richiesta deve essere autenticata
                .anyRequest().authenticated()
            )

            // Abilita autenticazione HTTP Basic (username/password base64 via header Authorization)
            .httpBasic(customizer -> {});

        // Costruisce e restituisce la configurazione finale
        return http.build();
    }
}
