package com.example.faqBackEnd.service;

import com.example.faqBackEnd.model.Faq;
import com.example.faqBackEnd.repository.FaqRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FaqServiceTest {

    private FaqRepository faqRepository;
    private FaqService faqService;

    @BeforeEach
    void setUp() {
        faqRepository = Mockito.mock(FaqRepository.class);
        faqService = new FaqService(faqRepository);
    }

    @Test
    void testFindById() {
        Faq faq = new Faq();
        faq.setId(1L);
        faq.setDomanda("Come faccio il login?");
        faq.setRisposta("Vai sulla homepage e inserisci le credenziali.");

        when(faqRepository.findById(1L)).thenReturn(Optional.of(faq));

        Optional<Faq> result = faqService.findById(1L);

        assertTrue(result.isPresent());
        assertEquals("Come faccio il login?", result.get().getDomanda());
    }
}