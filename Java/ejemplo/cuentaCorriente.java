package ejemplo;

public class cuentaCorriente extends Cuenta {
    private double tasaComision;
    
    public cuentaCorriente(String titular, double saldo, double tasaComision) {
        super(titular, saldo);
        this.tasaComision = tasaComision;
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            double montoConComision = cantidad - (cantidad * tasaComision);
            setSaldo(getSaldo() + montoConComision);
            System.out.println("Depósito exitoso. Nuevo saldo: " + getSaldo());
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
    }
    
}
