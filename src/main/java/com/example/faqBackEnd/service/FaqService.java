package com.example.faqBackEnd.service;

import com.example.faqBackEnd.model.Faq;
import com.example.faqBackEnd.repository.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servizio che gestisce la logica di business per le operazioni sulle FAQ.
 * Si interfaccia con il repository per eseguire operazioni CRUD.
 */
@Service
public class FaqService {

    @Autowired
    private FaqRepository faqRepository;

    /**
     * Costruttore con iniezione di dipendenza.
     * Utile anche per i test unitari con mock del repository.
     */
    @Autowired
    public FaqService(FaqRepository faqRepository) {
        this.faqRepository = faqRepository;
    }

    /**
     * Recupera l'elenco completo delle FAQ.
     * @return lista di FAQ
     */
    public List<Faq> findAll() {
        return faqRepository.findAll();
    }

    /**
     * Recupera una singola FAQ tramite ID.
     * @param id ID della FAQ
     * @return Optional contenente la FAQ se esiste
     */
    public Optional<Faq> findById(Long id) {
        return faqRepository.findById(id);
    }

    /**
     * Salva una nuova FAQ nel database.
     * @param faq FAQ da salvare
     * @return la FAQ salvata
     */
    public Faq save(Faq faq) {
        return faqRepository.save(faq);
    }

    /**
     * Aggiorna una FAQ esistente mantenendo la data di creazione.
     * @param id ID della FAQ da aggiornare
     * @param updatedFaq dati aggiornati
     * @return la FAQ modificata
     */
    public Faq updateFaq(Long id, Faq updatedFaq) {
        Faq existingFaq = faqRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("FAQ non trovata con ID: " + id));
    
        // Aggiorna solo i campi modificabili
        existingFaq.setDomanda(updatedFaq.getDomanda());
        existingFaq.setRisposta(updatedFaq.getRisposta());

        // La data di creazione resta invariata (non viene toccata)
        return faqRepository.save(existingFaq);
    }

    /**
     * Elimina una FAQ tramite il suo ID.
     * @param id ID della FAQ da eliminare
     */
    public void delete(Long id) {
        faqRepository.deleteById(id);
    }
}