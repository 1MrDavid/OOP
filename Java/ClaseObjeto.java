// ClaseObjeto.java
public class ClaseObjeto {
    static class Persona {
        String nombre;
        int edad;

        // Constructor
        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Método
        void saludar() {
            System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años.");
        }
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("David", 25);
        Persona persona2 = new Persona("Ana", 30);

        persona1.saludar();
        persona2.saludar();
    }
}