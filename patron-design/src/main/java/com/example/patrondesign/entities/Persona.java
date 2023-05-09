package com.example.patrondesign.entities;

import lombok.*;
import org.springframework.beans.factory.annotation.Configurable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Persona {

    private String nombre;
    private int edad;


}
