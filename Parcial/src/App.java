public class App {
    public static void main(String[] args) throws Exception {
    /* NO ALCANZAMOS A CREAR LOS OBJETO . TE AMAMOS NORBEY */
        Cuenta monto = new 
  // Crear una cuenta de cada tipo
  Crear Cuenta ahorros con titular "Laura Gómez", número "AH-001", saldo 500000, interés 3%
  Crear Cuenta ahorros premium con titular "Carlos Ríos", número "PR-002", saldo 2000000, interés 4%, comisión 2500
  Crear Cuenta corriente con titular "Empresa XYZ", número "CC-003", saldo 100000, límite 500000

  // Demostrar SOBRECARGA en depositar
  Llamar ahorros.depositar(50000)
  Llamar ahorros.depositar(100000, "Nómina julio")

  // Demostrar SOBREESCRITURA de retirar
  // CuentaAhorros: probar el límite de 3 retiros
  Llamar ahorros.retirar(20000)  // retiro 1
  Llamar ahorros.retirar(30000)  // retiro 2
  Llamar ahorros.retirar(10000)  // retiro 3
  Llamar ahorros.retirar(5000)   // debe rechazarse — límite alcanzado

  // CuentaAhorrosPremium: sin límite pero con comisión
  Llamar premium.retirar(100000) // debe descontar 100000 + 2500
  Llamar premium.retirar(50000)  // funciona sin problema

  // CuentaCorriente: probar sobregiro
  Llamar corriente.retirar(400000) // queda en -300000 (sobregiro)
  Llamar corriente.retirar(300000) // debe rechazarse — supera límite

  // Mostrar información de todas las cuentas
  Llamar ahorros.mostrarInfo()
  Llamar premium.mostrarInfo()
  Llamar corriente.mostrarInfo()

  // Aplicar intereses al final del mes
  Llamar ahorros.aplicarInteres()

    }
}
