package oo_basica.cuenta;

/*
Se desea llevar un control del estado de una cuenta corriente.
La cuenta corriente está caracterizada por su saldo y sobre ella se
pueden realizar tres tipos de operaciones:
saldo: devuelve el saldo de la cuenta (puede ser negativo).
imposición (cantidad): ingresa en la cuenta una cantidad de dinero.
reintegro (cantidad): saca de la cuenta una determinada cantidad de dinero.
        Supón que la cuenta corriente tiene inicialmente un saldo de cero y cree una clase CuentaCorriente con toda la funcionalidad necesaria.
Escriba una clase con un método main que pruebe la funcionalidad descrita.
 */

public class CuentaCorriente {
    int saldo;

    public CuentaCorriente() {
        this.saldo = 0;
    }

    public int devolverSaldo() {
        return saldo;
    }

    public void imposicion(int cantidadAingresar) {
        this.saldo = devolverSaldo() + cantidadAingresar;
    }

    public void reintegro(int cantidadAretirar) {
        this.saldo = devolverSaldo() - cantidadAretirar;
    }
}
