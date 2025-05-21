package com.utn.poo.ej1.libraries.Entities;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Persona {
    private String nombre;
    private int edad;
    private Domicilio domicilio;

    public Persona() {
    }

    public Persona(String nombre, int edad, Domicilio domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,
                ToStringStyle.SHORT_PREFIX_STYLE)
                .append("nombre", nombre)
                .append("edad", edad)
                .append("domicilio", domicilio)
                .toString();
    }
}
