package com.utn.poo.ej1.libraries;

import com.utn.poo.ej1.libraries.Entities.Domicilio;
import com.utn.poo.ej1.libraries.Entities.Persona;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepe", 100, new Domicilio("Calle Viva 123", "Springfield"));
        System.out.println(persona1);
    }
}
