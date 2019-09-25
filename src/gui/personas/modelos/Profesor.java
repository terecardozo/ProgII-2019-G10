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
public class Profesor extends Persona{

    private Cargo cargo;
    
    @Override
    public String toString() {
        return "Profesor " + super.getNombre() +" " + super.getApellido() + "\nDNI= " + super.getDni() + "\nRol= " + this.cargo;
    }

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 83 * hash + Objects.hashCode(super.getDni());
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Profesor other = (Profesor) obj;
//        if (!Objects.equals(super.getDni(), other.getDni())) {
//            return false;
//        }
//        return true;
//    }
       
    
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Cargo: " + cargo);
        return;
    }

    public Profesor(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
    }

    public Profesor(String nombre, String apellido, int dni, Cargo cargo) {
        super(nombre, apellido, dni);
        this.cargo=cargo;
    }
           
}
