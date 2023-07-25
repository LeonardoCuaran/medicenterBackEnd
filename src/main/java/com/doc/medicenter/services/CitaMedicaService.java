package com.doc.medicenter.services;

import com.doc.medicenter.models.CitaMedica;
import com.doc.medicenter.repositories.CitaMedicaRepository;
import org.springframework.stereotype.Service;

@Service
public class CitaMedicaService {

    private final CitaMedicaRepository citaMedicaRepository;

    public CitaMedicaService(CitaMedicaRepository citaMedicaRepository) {
        this.citaMedicaRepository = citaMedicaRepository;
    }

    public CitaMedica save(CitaMedica citaMedica) {
        return citaMedicaRepository.save(citaMedica);
    }

    public Iterable<CitaMedica> findAll() {
        return citaMedicaRepository.findAll();
    }
}
