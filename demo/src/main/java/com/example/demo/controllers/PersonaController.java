package com.example.demo.controllers;

import com.example.demo.entity.Persona;
import com.example.demo.services.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }


    @GetMapping
    public List<Persona> obtenerTodasLasPersonas() {
        return personaService.obtenerTodasLasPersonas();
    }

    @GetMapping("/aleatorio")
    public Persona obtenerPersonaAleatoria() {
        return personaService.obtenerPersonaAleatoria();
    }
}
