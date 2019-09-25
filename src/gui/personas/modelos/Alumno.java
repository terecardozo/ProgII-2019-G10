/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.personas.modelos;

import java.util.Objects;

/**
 *
 * @author gabinete
 */
public class Alumno extends Persona{
    
    private String cx;

    public Alumno(String nombre, String apellido, int dni, String cx) {
        super(nombre, apellido, dni);
        this.cx = cx;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(super.getDni());
        return hash;
    }
    
    public boolean equals(Object obj) {
        if(super.equals(obj)==false){
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Alumno other = (Alumno) obj;
            if (!Objects.equals(this.cx, other.cx)) {
                return false;
            }
        }
        return true;
    }


    

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre= " + super.getNombre() + ", apellido= " + super.getApellido() + ", dni= " + super.getDni() + ", cx= " + cx + '}';
    }
      
    public void mostrar()
    
    {
        super.mostrar();
        System.out.println("CX: " + cx);
        return;
    }
    
    
    
}
