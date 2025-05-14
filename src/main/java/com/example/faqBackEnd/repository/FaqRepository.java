package com.example.faqBackEnd.repository;

import com.example.faqBackEnd.model.Faq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interfaccia repository per l'entità Faq.
 * Estende JpaRepository per fornire metodi CRUD predefiniti (findAll, findById,
 * save, deleteById, ecc.).
 */
@Repository
public interface FaqRepository extends JpaRepository<Faq, Long> {
}
