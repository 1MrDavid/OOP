class Vehiculo {
    String marca;
    String modelo;

    Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    void arrancar() {
        System.out.println(marca + " " + modelo + " está arrancando");
    }
}

class Auto extends Vehiculo {
    Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    void abrirMaletero() {
        System.out.println(marca + " " + modelo + ": Maletero abierto");
    }
}

public class Herencia {
    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Corolla");
        miAuto.arrancar();      // heredado
        miAuto.abrirMaletero(); // propio
    }
}