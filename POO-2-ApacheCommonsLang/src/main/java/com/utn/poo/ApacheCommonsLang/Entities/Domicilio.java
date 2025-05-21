package com.utn.poo.ej1.libraries.Entities;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

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
        return new ToStringBuilder(this,
                ToStringStyle.SHORT_PREFIX_STYLE)
                .append("calle", calle)
                .append("ciudad", ciudad)
                .toString();
    }
}
