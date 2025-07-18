package com.example.demo.services;

import com.example.demo.entity.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> obtenerTodasLasPersonas();
    Persona obtenerPersonaAleatoria();
}
