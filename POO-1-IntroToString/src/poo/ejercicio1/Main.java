package poo.ejercicio1asdasd;

import poo.ejercicio1.Entities.Persona;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepe", "Mansilla", 25, false);
        Persona persona2 = new Persona("Juan", "Basile", 15, false);
        Persona persona3 = new Persona("Pedro", "Santos", 35, true);

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }
}
