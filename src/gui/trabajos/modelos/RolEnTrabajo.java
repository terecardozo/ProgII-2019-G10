/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trabajos.modelos;

import gui.personas.modelos.Profesor;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author gabinete
 */
public class RolEnTrabajo {
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private String razon;
    private Profesor unProfesor;
    private Rol rol;

    public RolEnTrabajo(LocalDate fechaInicio, LocalDate fechaHasta, String razon, Profesor unProfesor, Rol rol) {
        this.fechaDesde = fechaInicio;
        this.fechaHasta = fechaHasta;
        this.razon = razon;
        this.unProfesor = unProfesor;
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.unProfesor);
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
        final RolEnTrabajo other = (RolEnTrabajo) obj;
        if (!Objects.equals(this.unProfesor, other.unProfesor)) {
            return false;
        }
        return true;
    }

    public RolEnTrabajo(LocalDate fechaInicio, Profesor unProfesor, Rol rol) {
        this.fechaDesde = fechaInicio;
        this.unProfesor = unProfesor;
        this.rol = rol;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public Profesor getUnProfesor() {
        return unProfesor;
    }

    public void setUnProfesor(Profesor unProfesor) {
        this.unProfesor = unProfesor;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    public void mostrar() {
        unProfesor.mostrar();
        return;
    }
    
    
}
