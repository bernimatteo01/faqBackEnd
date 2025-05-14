package com.example.faqBackEnd.controller;

import com.example.faqBackEnd.model.Faq;
import com.example.faqBackEnd.service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 * Controller REST per la gestione delle FAQ.
 * Espone le API pubbliche per ottenere, creare, modificare ed eliminare FAQ.
 */
@RestController
@RequestMapping("/api/faq")
@CrossOrigin(origins = "http://localhost:4200") // Abilita le richieste CORS dal frontend Angular in localhost
public class FaqController {

    @Autowired
    private FaqService faqService;

    /**
     * Ottiene tutte le FAQ disponibili.
     * 
     * @return lista completa delle FAQ
     */
    @GetMapping
    public List<Faq> getAllFaq() {
        return faqService.findAll();
    }

    /**
     * Ottiene una singola FAQ tramite ID.
     * 
     * @param id identificativo della FAQ da recuperare
     * @return FAQ corrispondente all'ID, se presente
     */
    @GetMapping("/{id}")
    public Optional<Faq> getFaqById(@PathVariable Long id) {
        return faqService.findById(id);
    }

    /**
     * Crea una nuova FAQ.
     * Richiede un oggetto FAQ nel corpo della richiesta.
     * 
     * @param faq FAQ da inserire
     * @return la FAQ salvata con ID assegnato
     */
    @PostMapping
    public Faq createFaq(@RequestBody Faq faq) {
        return faqService.save(faq);
    }

    /**
     * Aggiorna una FAQ esistente identificata dall'ID.
     * 
     * @param id  ID della FAQ da aggiornare
     * @param faq oggetto contenente i nuovi dati
     * @return la FAQ aggiornata
     */
    @PutMapping("/{id}")
    public Faq updateFaq(@PathVariable Long id, @RequestBody Faq faq) {
        return faqService.updateFaq(id, faq);
    }

    /**
     * Elimina una FAQ tramite ID.
     * 
     * @param id identificativo della FAQ da rimuovere
     */
    @DeleteMapping("/{id}")
    public void deleteFaq(@PathVariable Long id) {
        faqService.delete(id);
    }
}
