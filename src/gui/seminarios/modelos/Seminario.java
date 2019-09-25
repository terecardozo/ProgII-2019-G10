/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.seminarios.modelos;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author gabinete
 */
public class Seminario {
    private String observaciones;
    private LocalDate fechaExposicion;
    private NotaAprobacion nota;

    public Seminario(LocalDate fechaExposicion, NotaAprobacion nota) {
        this.fechaExposicion = fechaExposicion;
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.fechaExposicion);
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
        final Seminario other = (Seminario) obj;
        if (!Objects.equals(this.fechaExposicion, other.fechaExposicion)) {
            return false;
        }
        return true;
    }
    
    
    
    public Seminario(LocalDate fechaExposicion, NotaAprobacion nota, String observaciones) {
        this(fechaExposicion, nota);
        this.observaciones=observaciones;
    }

    @Override
    public String toString() {
        return "Seminario{" + "observaciones=" + observaciones + ", fechaExposicion=" + fechaExposicion + ", nota=" + nota + '}';
    }
    
    public void mostrar()
    {
        System.out.println("Nota: " + this.nota);
        System.out.println("Fecha de exposición: " + this.fechaExposicion);
        if(observaciones!=null)
        {
            System.out.println("Observaciones: " + this.observaciones);
        }
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LocalDate getFechaExposicion() {
        return fechaExposicion;
    }

    public void setFechaExposicion(LocalDate fechaExposicion) {
        this.fechaExposicion = fechaExposicion;
    }

    public NotaAprobacion getNota() {
        return nota;
    }

    public void setNota(NotaAprobacion nota) {
        this.nota = nota;
    }
}
