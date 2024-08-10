/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tutoriales.todocode2023.logica;

/**
 *
 * @author viktor
 */
public class Tutorial01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
     
        Alumno alumnoVictor= new Alumno("17682241-4", "VICTOR", "GÓMEZ","INGENIERIA DE SOFTWARE");
        alumnoVictor.setEdad(34);
        alumnoVictor.mostrarInfoPersona();
        alumnoVictor.setNota(1, 4.5);
        alumnoVictor.setNota(2, 3.2);
        alumnoVictor.setNota(3, 6.8);
        double promedio=alumnoVictor.getPromedio();
        System.out.println("El promedio del alumno es: "+ String.format("%.1f", promedio) );
        
        Alumno alumnoPedro= new Alumno("2185341-2", "PEDRO", "AGUIRRE","INGENIERIA DE SOFTWARE");
        alumnoPedro.setEdad(24);
        alumnoPedro.mostrarInfoPersona();
        alumnoPedro.setNota(1, 5.5);
        alumnoPedro.setNota(2, 4.2);
        alumnoPedro.setNota(3, 5.8);
        
        Persona andres= new Persona("189234123-k", "ANDRES", "CORNEJO");
        Profesor profeAndres= new Profesor(andres,"FPY1101");
        //el polimorfmismo me permite crear tipos compuestos de objetos que tienen alguna relación fuerte que puede ser representada por medio de la herencia.
        Persona personasCurso[]=new Persona[3];
        personasCurso[0]=alumnoPedro;
        personasCurso[1]=alumnoVictor;
        personasCurso[2]=profeAndres;
           
    }
}
