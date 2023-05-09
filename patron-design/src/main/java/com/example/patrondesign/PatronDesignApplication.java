package com.example.patrondesign;

import com.example.patrondesign.entities.Configuration;
import com.example.patrondesign.entities.Persona;
import com.example.patrondesign.entities.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatronDesignApplication.class, args);

        PersonaService personaService = new PersonaService();
        personaService.testBuilder();

        personaService.imprimirPersonas();

    }

}
