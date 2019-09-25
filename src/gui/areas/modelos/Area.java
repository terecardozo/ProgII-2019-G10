/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.areas.modelos;

import java.util.Objects;

/**
 *
 * @author gabinete
 */
public class Area {
    private String nombre;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Area other = (Area) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Area(String nombre) {
        this.nombre = nombre;
    }
    
    public void CrearArea(String nombre) {
        Area area = new Area(this.nombre);
    }

    @Override
    public String toString() {
        return "Area{" + "nombre=" + nombre + '}';
    }
    
    
    
    
}
