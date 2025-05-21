package poo.ejercicio1.Entities;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
     private boolean tieneHijos;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, boolean tieneHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tieneHijos = tieneHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTieneHijos() {
        return tieneHijos;
    }

    public void setTieneHijos(boolean tieneHijos) {
        this.tieneHijos = tieneHijos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", tieneHijos=" + tieneHijos + '}';
    }
}
