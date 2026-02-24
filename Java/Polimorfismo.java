class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau!");
    }
}

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Miau!");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        Animal[] animales = {new Perro(), new Gato(), new Animal()};

        for (Animal a : animales) {
            a.hacerSonido(); // mismo método, diferente comportamiento
        }
    }
}