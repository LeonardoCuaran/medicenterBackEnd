package com.doc.medicenter.services;

import com.doc.medicenter.models.Paciente;
import com.doc.medicenter.repositories.PacienteRepository;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository ;

    public PacienteService(PacienteRepository pacienteRepository ) {
        this.pacienteRepository  = pacienteRepository ;
    }

    public Paciente save(Paciente paciente) {
        return pacienteRepository .save(paciente);
    }

    public Iterable<Paciente> findAll() {
        return pacienteRepository .findAll();
    }
}
