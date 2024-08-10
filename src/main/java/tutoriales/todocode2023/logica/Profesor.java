/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriales.todocode2023.logica;

/**
 *
 * @author viktor
 */

import java.util.ArrayList;


public class Profesor extends Persona {
    
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    String seccion;

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    public Profesor(String rut, String nombre, String apellido,String seccion) {
        super(rut, nombre, apellido);
        this.seccion=seccion;
        
    }
    public Profesor(Persona persona,String seccion) {
        super(persona.rut,persona.nombre,persona.apellido);
        this.seccion=seccion;
        
    }
    
    public void asignarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
    
    
    
    public int cantidadAlumnos(){
    
        return alumnos.size();
    }
    
}
