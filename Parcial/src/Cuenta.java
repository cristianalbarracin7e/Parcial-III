public class Cuenta {
    private String titular;
    private String numeroCuenta;
    private double saldo;
    public Cuenta (String titular, String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta= numeroCuenta;
        this.saldo = saldo;
        if (saldo < 0){
          this.saldo = 0;

        }else {
            this.saldo = saldo;
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public void depositar(double monto){
        if (monto > 0){
            this.saldo= saldo + monto;
            System.out.println("Deposito de" + monto + "realizado.Nuevo Saldo:" + saldo);
        } else if (monto < 0) {
            System.out.println("El monto debe ser positivo");
        } else {
        }
    
    }
    public void depositar(double monto, String concepto){
        if (monto > 0){
            this.saldo = saldo + monto;
            System.out.println("Deposito de" + monto + "por concepto" + concepto + ".Nuevo saldo:"+ saldo);
        }else if (monto<0){
            System.out.println("el monto debe ser positivo");
        }else {
        }

    }
    public boolean retirar(double monto){
        if (monto <= 0){
            System.out.println("monto invalido");
            return false;
        }
        if (monto <= saldo){
            this.saldo = saldo - monto;
            System.out.println("retiro de"+ monto + "Exitoso.saldo restante:"+ saldo);
            return true;
        }else if (monto <= saldo){
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    public void mostrarInfo(){
        System.out.println("=== Informacion de cuenta===");
        System.out.println("Titular:"+ titular);
        System.out.println("Numero: " + numeroCuenta);
        System.out.println("saldo" + saldo);
    }
}
   

