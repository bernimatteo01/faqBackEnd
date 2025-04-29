package com.example.faqBackEnd.controller;

import com.example.faqBackEnd.model.Faq;
import com.example.faqBackEnd.service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/faq")
@CrossOrigin(origins = "http://localhost:4200") // Serve per permettere chiamate dal frontend Angular
public class FaqController {

    @Autowired
    private FaqService faqService;

    @GetMapping
    public List<Faq> getAllFaq() {
        return faqService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Faq> getFaqById(@PathVariable Long id) {
        return faqService.findById(id);
    }

    @PostMapping
    public Faq createFaq(@RequestBody Faq faq) {
        return faqService.save(faq);
    }

    @PutMapping("/{id}")
    public Faq updateFaq(@PathVariable Long id, @RequestBody Faq faq) {
        return faqService.updateFaq(id, faq);
    }


    @DeleteMapping("/{id}")
    public void deleteFaq(@PathVariable Long id) {
        faqService.delete(id);
    }
}
