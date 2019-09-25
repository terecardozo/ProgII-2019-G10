/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trabajos.modelos;

import gui.personas.modelos.Alumno;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author gabinete
 */
public class AlumnoEnTrabajo {
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private String razon;
    private Alumno unAlumno;

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.unAlumno);
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
        final AlumnoEnTrabajo other = (AlumnoEnTrabajo) obj;
        if (!Objects.equals(this.unAlumno, other.unAlumno)) {
            return false;
        }
        return true;
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

    public Alumno getUnAlumno() {
        return unAlumno;
    }

    public void setUnAlumno(Alumno unAlumno) {
        this.unAlumno = unAlumno;
    }

    public AlumnoEnTrabajo(LocalDate fechaInicio, Alumno unAlumno) {
        this.fechaDesde = fechaInicio;
        this.unAlumno = unAlumno;
    }
   
            
    public AlumnoEnTrabajo(LocalDate fechaInicio, Alumno unAlumno, LocalDate fechaHasta, String razon) {
        this(fechaInicio, unAlumno);
        this.fechaHasta = fechaHasta;
        this.razon = razon;
    }
    
    public void mostrar(){
        
        unAlumno.mostrar();
        return;
    }
    
    
}
