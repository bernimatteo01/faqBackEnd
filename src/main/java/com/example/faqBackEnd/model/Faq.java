package com.example.faqBackEnd.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Entità JPA che rappresenta una FAQ (Frequently Asked Question).
 * Viene mappata sulla tabella "faq" del database.
 */
@Entity
@Table(name = "faq")
public class Faq {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificativo univoco (chiave primaria)

    private String domanda; // Testo della domanda

    private String risposta; // Testo della risposta

    @Column(name = "data_creazione", updatable = false)
    private LocalDateTime dataCreazione; // Data di creazione (non modificabile)

    @Column(name = "data_modifica")
    private LocalDateTime dataModifica; // Data dell'ultima modifica

    /**
     * Metodo eseguito automaticamente prima dell'inserimento della riga nel DB.
     * Imposta la data di creazione e la data di modifica al momento corrente.
     */
    @PrePersist
    public void onCreate() {
        if (dataCreazione == null) {
            dataCreazione = LocalDateTime.now();
        }
        dataModifica = LocalDateTime.now();
    }

    /**
     * Metodo eseguito automaticamente prima di ogni aggiornamento della riga nel DB.
     * Aggiorna la data di modifica.
     */
    @PreUpdate
    public void onUpdate() {
        dataModifica = LocalDateTime.now();
    }

    // Getter e Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDomanda() {
        return domanda;
    }

    public void setDomanda(String domanda) {
        this.domanda = domanda;
    }

    public String getRisposta() {
        return risposta;
    }

    public void setRisposta(String risposta) {
        this.risposta = risposta;
    }

    public LocalDateTime getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(LocalDateTime dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public LocalDateTime getDataModifica() {
        return dataModifica;
    }

    public void setDataModifica(LocalDateTime dataModifica) {
        this.dataModifica = dataModifica;
    }
}
