package oo_basica.cuenta;

public class MainCuentaCorriente {

    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente();

        cuenta.imposicion(1000);

        System.out.println(" Saldo después del ingreso: " + cuenta.devolverSaldo());

        cuenta.reintegro(200);

        System.out.println(" Saldo después del reintegro: " + cuenta.devolverSaldo());

    }
}
