package poo.ejercicio3.Entities;

public class Domicilio {
     private String calle;
    private String ciudad;

    public Domicilio() {
    }

    public Domicilio(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", ciudad=" + ciudad + '}';
    }
}
