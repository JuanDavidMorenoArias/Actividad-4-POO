package CuentaBancaria;

import java.util.Scanner;
public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("ingrese su saldo inicial: ");
        float saldoInicial = entrada.nextFloat();
        System.out.println("Ingrese su tasa de Interes: ");
        float tasaAhorros = entrada.nextFloat();
        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicial, tasaAhorros);
        System.out.println("Ingrese la cantidad a consignar: ");
        float cantidad1 = entrada.nextFloat();
        cuenta1.consignar(cantidad1);
        System.out.println("Ingrese la cantidad a retirar: ");
        float cantidad2 = entrada.nextFloat();
        cuenta1.retirar(cantidad2);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
    }
}