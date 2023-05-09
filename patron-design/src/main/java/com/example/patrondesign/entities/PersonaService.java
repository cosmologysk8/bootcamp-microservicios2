package com.example.patrondesign.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class PersonaService {

    @Autowired
    private Persona singletonPersona;

    @Autowired
    private Persona prototypePersona;

    public void testBuilder(){
        Persona persona = Persona.builder().edad(20).nombre("Juan").build();
        System.out.println(persona.toString());
    }

    public void imprimirPersonas() {
        System.out.println("Singleton : " + singletonPersona.getNombre() + " " + singletonPersona.getEdad());
        System.out.println("Prototype : " + prototypePersona.getNombre() + " " + prototypePersona.getEdad());
    }

}
