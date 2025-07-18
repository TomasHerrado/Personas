package com.example.demo.services.impl;

import com.example.demo.entity.Persona;
import com.example.demo.repositories.PersonaRepository;
import com.example.demo.services.PersonaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class PersonaServiceImpl implements PersonaService {
    private final PersonaRepository personaRepository;
    private final Random random = new Random();

    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> obtenerTodasLasPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPersonaAleatoria() {
        List<Persona> personas = personaRepository.findAll();
        if (personas.isEmpty()) {
            return null;
        }
        return personas.get(random.nextInt(personas.size()));
    }
}
