
package tutoriales.todocode2023.logica;

/**
 *
 * @author viktor
 */
public class Persona {
    
    int edad;
    String rut;
    String nombre;
    String apellido;
    
    public Persona(String rut, String nombre, String apellido) {
    this.rut = rut;
    this.nombre = nombre;
    this.apellido = apellido;
    }
      public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
       public void mostrarInfoPersona(){
        //%n inserta una salto de línea y es independiente de la plataforma. Esto permite que funcione correctamente en diferentes SO.
        //%d se usa para referenciar enteros
        System.out.printf("Hola, mi nombre es %s y tengo %d años.%n", this.nombre, this.edad);
    }
    
}
