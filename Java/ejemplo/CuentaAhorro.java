package ejemplo;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(String titular, double saldo, double tasaInteres) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }
    
}
