package com.example.patrondesign.entities;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean("singletonPersona")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Persona singletonPersona() {
        return new Persona("Juan", 30);
    }

    @Bean("prototypePersona")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Persona prototypePersona() {
        return new Persona("Maria", 25);
    }

}
