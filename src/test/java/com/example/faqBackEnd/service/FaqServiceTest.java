package com.example.faqBackEnd.service;

import com.example.faqBackEnd.model.Faq;
import com.example.faqBackEnd.repository.FaqRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Test unitario della classe FaqService.
 * Utilizza Mockito per simulare il comportamento del repository senza accedere al database reale.
 */
class FaqServiceTest {

    private FaqRepository faqRepository;
    private FaqService faqService;

    /**
     * Setup eseguito prima di ogni test.
     * Crea un mock del repository e un'istanza reale del service con il mock iniettato.
     */
    @BeforeEach
    void setUp() {
        faqRepository = Mockito.mock(FaqRepository.class);
        faqService = new FaqService(faqRepository);
    }

    /**
     * Testa il metodo findById() del service.
     * Verifica che venga restituita correttamente una FAQ esistente simulando il comportamento del repository.
     */
    @Test
    void testFindById() {
        // Preparazione: creo una FAQ fittizia
        Faq faq = new Faq();
        faq.setId(1L);
        faq.setDomanda("Come faccio il login?");
        faq.setRisposta("Vai sulla homepage e inserisci le credenziali.");

        // Definisco il comportamento del mock: se viene chiamato findById(1L), restituisce quella FAQ
        when(faqRepository.findById(1L)).thenReturn(Optional.of(faq));

        // Eseguo il metodo da testare
        Optional<Faq> result = faqService.findById(1L);

        // Verifico i risultati
        assertTrue(result.isPresent()); // Verifica che il risultato non sia vuoto
        assertEquals("Come faccio il login?", result.get().getDomanda()); // Verifica il contenuto della domanda
    }
}