public class CuentaAhorros extends Cuenta {
    private double tasaInteres;
    private int retirosMesActual;
    public CuentaAhorros (double tasaInteres, int retirosMesActual, String titular, String numeroCuenta, double saldo){
        super(titular,  numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
        this.retirosMesActual = retirosMesActual;
    }
    @Override 
    public boolean retirar(double monto){
        if (monto <=0){
            System.out.println("Monto invalido");
            return false;
        }
        if (saldo - monto)>=(- limiteCredito){
            this.saldo = saldo - monto;
            System.out.println("retiro de:" + monto + "aprobado.Saldo:"+ saldo );
            if (saldo < 0){
                System.out.println(" Cuenta en sobregiro"+ saldo);
            }else if  (saldo<0){
                return true;
            }else {
                System.out.println("limite de credito superado.retiro denegado");
                return false;
            }

        }
    }
}
