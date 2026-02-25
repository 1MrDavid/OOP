package ejemplo;

public class UsarCuenta {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta("Juan Pérez", 1000.0);
        
        System.out.println("Titular: " + miCuenta.getTitular());
        System.out.println("Saldo inicial: " + miCuenta.getSaldo());
        
        miCuenta.depositar(500.0); // Depositar dinero
        System.out.println("Saldo después del depósito: " + miCuenta.getSaldo());

        Cuenta otraCuenta = new Cuenta("María López", 2000.0);
        System.out.println("Titular: " + otraCuenta.getTitular());

        CuentaAhorro miCuentaAhorro = new CuentaAhorro("Carlos Gómez", 1500.0, 0.05);
        System.out.println("Titular: " + miCuentaAhorro.getTitular());
        System.out.println("Tasa de interés: " + miCuentaAhorro.getTasaInteres());

        System.out.println("Titulares: " + miCuenta.getTitular() + ", " 
        + otraCuenta.getTitular() + ", " + miCuentaAhorro.getTitular());
    }
}
