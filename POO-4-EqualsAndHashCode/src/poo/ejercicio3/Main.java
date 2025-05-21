package poo.ejercicio3;

import poo.ejercicio3.Entities.Domicilio;
import poo.ejercicio3.Entities.Persona;

public class Main {

    public static void main(String[] args) {
        Domicilio domicilio = new Domicilio("Calle Viva 123", "Springfield");
        Persona persona1 = new Persona("Pepe", 100, domicilio);
        System.out.println(persona1);
        
        Persona personaCopy = persona1;
        
        System.out.println("\nCASO MISMO HASH Y MISMO CONTENIDO\n");
        System.out.println("Hash persona original: " + persona1.hashCode());
        System.out.println("Hash personaCopy: " + personaCopy.hashCode());
        System.out.println("equals persona1 y personaCopy: " + persona1.equals(personaCopy));
        System.out.println("---------------------------------");

        Persona persona2 = new Persona("Pepe1", 100, domicilio);
        
        System.out.println("\nCASO DISTINTO HASH Y DISTINTO CONTENIDO\n");
        System.out.println("Hash persona original: " + persona1.hashCode());
        System.out.println("Hash persona 2: " + persona2.hashCode());
        System.out.println("equals persona1 y persona2: " + persona1.equals(persona2));
        System.out.println("Hola");
    }
    
}
