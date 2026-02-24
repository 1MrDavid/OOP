// Encapsulacion.java
public class Encapsulacion {
    static class CuentaBancaria {
        private String titular;
        private double saldo; // privado

        public CuentaBancaria(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }

        // Getter
        public double getSaldo() {
            return saldo;
        }

        public String getTitular() {
            return titular;
        }

        // Métodos públicos para modificar saldo
        public void depositar(double monto) {
            if (monto > 0) saldo += monto;
            else System.out.println("Monto inválido");
        }

        public void retirar(double monto) {
            if (monto > 0 && monto <= saldo) saldo -= monto;
            else System.out.println("Saldo insuficiente o monto inválido");
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("David", 1000);
        System.out.println("Saldo: " + cuenta.getSaldo());
        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}