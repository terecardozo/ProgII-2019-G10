/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trabajos.modelos;

import gui.areas.modelos.Area;
import gui.personas.modelos.Alumno;
import gui.personas.modelos.Profesor;
import gui.seminarios.modelos.NotaAprobacion;
import gui.seminarios.modelos.Seminario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author gabinete
 */
public class Trabajo {

    private String titulo;
    private int duracion;
    private LocalDate fechaPresentacion;
    private LocalDate fechaAprobacion;
    private LocalDate fechaExposicion;
    
    private ArrayList<Area> areas;
    private ArrayList<AlumnoEnTrabajo> alumnos;
    private ArrayList<RolEnTrabajo> profesores;
    private ArrayList<Seminario> seminarios;
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public LocalDate getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(LocalDate fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public LocalDate getFechaExposicion() {
        return fechaExposicion;
    }

    public void setFechaExposicion(LocalDate fechaExposicion) {
        this.fechaExposicion = fechaExposicion;
    }
//  Trabajo trab1 = new Trabajo ("Protocolos de comunicación", listaA1,6, fecha1, listaAeT, listaRT);
    public Trabajo(String titulo, ArrayList<Area> areas, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion, LocalDate fechaFinal) {
        this.titulo = titulo;
        this.areas = areas;
        this.duracion = duracion;
        this.fechaPresentacion = fechaPresentacion;
        this.fechaAprobacion = fechaAprobacion;
        this.fechaExposicion = fechaFinal;
    }

    public Trabajo(String titulo, ArrayList<Area> areas, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion) {
        this.titulo = titulo;
        this.areas = areas;
        this.duracion = duracion;
        this.fechaAprobacion = fechaAprobacion;
        this.fechaPresentacion = fechaPresentacion;
    }
    
    public Trabajo(String titulo, ArrayList<Area> areas, int duracion, LocalDate fechaPresentacion, ArrayList<AlumnoEnTrabajo> alumnos, ArrayList<RolEnTrabajo> profesores) {
        this.titulo = titulo;
        this.areas = areas;
        this.duracion = duracion;
        this.fechaPresentacion = fechaPresentacion;
        this.alumnos = alumnos;
        this.profesores = profesores;
    }
    
    public Trabajo(String titulo, ArrayList<Area> areas, int duracion) { //Porque tengo ganas
        this.titulo = titulo;
        this.areas = areas;
        this.duracion = duracion;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.titulo);
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
        final Trabajo other = (Trabajo) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Trabajo{" + "titulo=" + titulo + ", areas=" + areas + ", duracion=" + duracion + ", fechaPresentacion=" + fechaPresentacion + ", fechaAprobacion=" + fechaAprobacion + ", fechaFinal=" + fechaExposicion + '}';
    }

    public String agregarProfesor(LocalDate fechaInicio, Profesor unProfesor, Rol rol) {
        RolEnTrabajo profesor = new RolEnTrabajo(fechaInicio, unProfesor, rol);
        if(!profesores.contains(profesor))
        {
            profesores.add(profesor);
            return "El profesor fue agregado con exitos";
        }
        else
            return "El profesor no pudo ser agregado";
    }

    public String agregarProfesor(RolEnTrabajo profesor) {
        if(!profesores.contains(profesor))
        {
            profesores.add(profesor);
            return "El profesor fue agregado con exitos";
        }
        else
            return "El profesor no pudo ser agregado";
    }

    public String agregarAlumno(LocalDate fechaInicio, Alumno unAlumno) {
        AlumnoEnTrabajo alumno = new AlumnoEnTrabajo(fechaInicio, unAlumno);
        if(!alumnos.contains(alumno))
        {
            alumnos.add(alumno);
            return "El alumno fue agregado con exitos";
        }
        else
            return "El alumno no pudo ser agregado";
    }

    public String agregarAlumno(AlumnoEnTrabajo alumno) {
        if(!alumnos.contains(alumno))
        {
            alumnos.add(alumno);
            return "El alumno fue agregado con exitos";
        }
        else
            return "El alumno no pudo ser agregado";
    }
    
    public void agregarSeminario(LocalDate fechaExposicion, NotaAprobacion nota) {
        Seminario seminario = new Seminario(fechaExposicion, nota);
        if(!seminarios.contains(seminario))
            seminarios.add(seminario);
    }
    
    public void agregarSeminario(Seminario seminario) {
        if(!seminarios.contains(seminario))
            seminarios.add(seminario);
    }

    public void mostrar() {
        /*
        Trabajo: Tema del Trabajo de Graduacion
        Duración: 6 meses
        Fecha Presentación en la CA: 01/02/2018
        Fecha Aprobacion: 10/02/2018
        Fecha Exposición: -
        Alumnos
        ----------------------
        CX14153322 - Juarez, Juan José
        CX15223345 - Lopez, Julio
        Tutor
        ----------------------
        José Younes
        Jurado
        ----------------------
        Luis Nieto
        Fernanda Guzman
        Teresa Cardozo
         */

        System.out.println("Trabajo: " + titulo);
        System.out.println("Duracion: " + duracion);
                
        if (fechaPresentacion == null) {
            System.out.println("Fecha de presentacion en la CA: -");
        } else {
            System.out.println("Fecha de presentacion en la CA: " + fechaPresentacion);
        }
        
        if (fechaAprobacion == null) {
            System.out.println("Fecha de aprobacion: -");
        } else {
            System.out.println("Fecha de aprobacion: " + fechaAprobacion);
        }

        if (fechaExposicion == null) {
            System.out.println("Fecha de exposicion: -");
        } else {
            System.out.println("Fecha de exposicion: " + fechaExposicion);
        }

        System.out.println("\nAlumnos\n--------------");

        for (AlumnoEnTrabajo a : alumnos) {
            if(!a.equals(null))
                    a.mostrar();
        }

        System.out.println("Tutor\n--------------");

        for (RolEnTrabajo r : profesores) {
            if (r.getRol() == Rol.TUTOR) {
                r.mostrar();
            }
        }

        System.out.println("Cotutor\n--------------");
        
        if(profesores != null) //Posiblemente este mal, pero no altera nada
        {    
            for (RolEnTrabajo r : profesores) {
                if (r.getRol() == Rol.COTUTOR) {
                    r.mostrar();
                }
            }
        }
        System.out.println("Jurado\n--------------");
        
        if(profesores != null) //Posiblemente este mal, pero no altera nada
        {
            for (RolEnTrabajo r : profesores) {
                if (r.getRol() == Rol.JURADO) {
                    r.mostrar();
                }
            }
        }        
    }

}
