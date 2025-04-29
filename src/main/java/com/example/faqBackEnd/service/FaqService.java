package com.example.faqBackEnd.service;

import com.example.faqBackEnd.model.Faq;
import com.example.faqBackEnd.repository.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FaqService {

    @Autowired
    private FaqRepository faqRepository;

    @Autowired
    public FaqService(FaqRepository faqRepository) {
        this.faqRepository = faqRepository;
    }

    public List<Faq> findAll() {
        return faqRepository.findAll();
    }

    public Optional<Faq> findById(Long id) {
        return faqRepository.findById(id);
    }

    public Faq save(Faq faq) {
        return faqRepository.save(faq);
    }

    public Faq updateFaq(Long id, Faq updatedFaq) {
        Faq existingFaq = faqRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("FAQ non trovata con ID: " + id));
    
        // Aggiorna solo domanda e risposta
        existingFaq.setDomanda(updatedFaq.getDomanda());
        existingFaq.setRisposta(updatedFaq.getRisposta());
        // dataCreazione viene mantenuta automaticamente, no need to set.
    
        return faqRepository.save(existingFaq);
    }
    
    public void delete(Long id) {
        faqRepository.deleteById(id);
    }
}
