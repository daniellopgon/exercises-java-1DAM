package test;

import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaBancariaTest {

    @Test
    public void testSaldoInicialEsCero() {
        CuentaBancaria cuenta = new CuentaBancaria();
        double saldo = cuenta.getSaldo();
        assertEquals(0.0, saldo, 0.001);
    }

    @Test
    public void testDepositoPositivo() {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(100);
        double saldo = cuenta.getSaldo();
        assertEquals(100.0, saldo, 0.001);
    }

    @Test
    public void testDepositoNegativoNoCambiaSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(-50);
        double saldo = cuenta.getSaldo();
        assertEquals(0.0, saldo, 0.001);
    }

    @Test
    public void testRetiroValido() {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(100);
        cuenta.retirar(40);
        double saldo = cuenta.getSaldo();
        assertEquals(60.0, saldo, 0.001);
    }

    @Test
    public void testRetiroSuperiorAlSaldoNoSePermite() {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(100);
        cuenta.retirar(2000);
        double saldo = cuenta.getSaldo();
        assertEquals(100.0, saldo, 0.001);
    }
}
