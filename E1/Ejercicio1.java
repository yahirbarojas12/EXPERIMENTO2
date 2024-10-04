package mx.unam.fi.poo.g1.e1; 
import mx.unam.fi.poo.g1.e1.*; 

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Se crea un objeto Cuenta Banco (C/b  No. CB1234) con un saldo inicial de $500");
        CuentaBanco CB1234 = new CuentaBanco("CB1234", 500.0);
        System.out.println("Se depositan $1000 a la cuenta CB1234");
        CB1234.depositar(1000.0);
        System.out.println("Saldo nuevo: " + CB1234.getSaldo());
        System.out.println("Se retiran $600 de la cuenta CB1234");
        CB1234.retirar(600.0);
        System.out.println("Saldo nuevo: " + CB1234.getSaldo());
        System.out.println("\nCrando un objeto cuentaAhorro (C/a No. CA1000) con un saldo incial de $450");
        CuentaAhorro CA1000 = new CuentaAhorro("CA1000", 450);
        System.out.println("Se retiran $300 de la cuenta");
        CA1000.retirar(300.0);
        System.out.println("Saldo nuevo: " + CA1000.getSaldo());
        System.out.println("\nCreando un objeto CuentaAhorro (C/a No. CA1001) con un saldo inicial de $300");
        CuentaAhorro CA1001 = new CuentaAhorro("CA1001", 300.0);
        System.out.println("Se intenta un retiro por 250...");
        CA1001.retirar(250.0);
        System.out.println("Sueldo actual: " + CA1001.getSaldo());
    }
}