package com.doc.medicenter.controllers;

import com.doc.medicenter.models.CitaMedica;
import com.doc.medicenter.services.CitaMedicaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/citaMedica")
public class CitaMedicaController {

    private final CitaMedicaService citaMedicaService;

    public CitaMedicaController(CitaMedicaService citaMedicaService) {
        this.citaMedicaService = citaMedicaService;
    }

    @PostMapping
    public CitaMedica createCitaMedica(@RequestBody @Valid CitaMedica citaMedica) {
        return citaMedicaService.save(citaMedica);
    }

    @GetMapping
    public Iterable<CitaMedica> getAllCitaMedica() {
        return citaMedicaService.findAll();
    }
}
