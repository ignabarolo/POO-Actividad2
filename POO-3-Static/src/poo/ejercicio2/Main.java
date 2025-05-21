package poo.ejercicio2;

import poo.ejercicio2.Entities.Auto;

public class Main {

    public static void main(String[] args) {
        
        Auto auto1 = new Auto("XP21R", "Peogeot", 20500D, "Azul");
        Auto auto2 = new Auto("T221E", "Ford", 10500D, "Azul");
        Auto auto3 = new Auto("X1F5A", "Fiat", 12500D, "Azul");
        Auto auto4 = new Auto("YA21Q", "Chevrolet", 21500D, "Azul");
        
        System.out.println(auto1.precioPromocional());
        System.out.println(auto2.precioPromocional());
        System.out.println(auto3.precioPromocional());
        System.out.println(auto4.precioPromocional());

        Auto.anularDescuento();
        System.out.println(" ");
        
        System.out.println(auto1.precioPromocional());
        System.out.println(auto2.precioPromocional());
        System.out.println(auto3.precioPromocional());
        System.out.println(auto4.precioPromocional());
    }
    
}
