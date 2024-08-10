/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriales.todocode2023.logica;

/**
 *
 * @author viktor
 */
public class Alumno extends Persona {
    
    //atributos que representaran las caracteristicas de un objeto
 
    String carrera;
    double promedio;
    double notas [];

    public Alumno(String rut, String nombre, String apellido, String carrera) {
        
        super(rut, nombre, apellido);
        this.carrera = carrera;
        notas = new double[3];
      
    }
    public void setNota(int notaNum, double nota){
        
        if(notaNum>0 && notaNum<=3){
            notas[notaNum-1]=nota;
        }
        calcularPromedio();
    }
    
    //los metodos son las funciones que tiene el objeto y representa los servicios que nos puede proporcionar el objeto. Definen el comportamiento del objeto
    //los metodos se declaran como verbos en infinitivo por ejemplo: correr, caminar,saltar, jugar, etc.
    //si un metodo no retorna valor decimos que es un "procedimiento". Si retornan valor son "funciones".
   
    // para definir el nombre delos atributos y métodos se suele usar la convención camelcase.
    //por convencion los geters y setters van entre el constructor y los metodos que definimos para las reglas de negocio
    
    public double getPromedio(){
        return promedio;
    }
    
    private void calcularPromedio(){
        if(notas.length ==3){
            double suma=0;
            for(int i=0;i<notas.length;i++){
                suma = suma + notas[i];
                
            }
            this.promedio=  suma/notas.length;
        }
        
    }

    
    public void mostrarMensajePromedio(){
        
        if(this.promedio > 4.0){
            //%f se usa para referenciar valores decimales
            System.out.printf("Has aprobado con un %.1f%n",this.promedio);
        }else{
            System.out.println("Lo sentimos, has reprobado");
        }
    
    }
    
    
    
    
}
