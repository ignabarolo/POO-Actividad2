package poo.ejercicio2.Entities;

public class Auto {
    private String patente;
    private String marca;
    private double precio;
    private String color;
    private static double dto;

    public Auto() {
    }

    public Auto(String patente, String marca, Double precio, String color) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        Auto.dto = 10;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double precioPromocional(){
        return this.precio - this.precio * Auto.dto / 1000;
    }
    
    public static void anularDescuento(){
        Auto.dto = 0;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", precio=" + precio + ", color=" + color + '}';
    }
}
