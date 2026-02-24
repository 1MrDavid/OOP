abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: obligatorio en clases hijas
    public abstract void hacerSonido();

    // Método concreto
    public void presentarse() {
        System.out.println("Soy un animal llamado " + nombre);
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau!");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau!");
    }
}

public class Abstraccion {
    public static void main(String[] args) {
        Animal[] animales = {new Perro("Rex"), new Gato("Michi")};

        for (Animal a : animales) {
            a.presentarse();  // método común
            a.hacerSonido();  // método obligatorio
            System.out.println("---");
        }
    }
}