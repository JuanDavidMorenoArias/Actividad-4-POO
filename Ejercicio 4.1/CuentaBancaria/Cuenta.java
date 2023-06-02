package CuentaBancaria;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    public void consignar(float cantidad){
        saldo += cantidad;
        numeroConsignaciones += 1;
    }
    public void retirar(float cantidad){
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0){
            saldo -= cantidad;
            numeroRetiros += 1;
        } else{
            System.out.println("La cantida a retirar excede el saldo actual.");
        }
    }
    public void calcularInteres(){
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }
    public void extractoMensual(){
        saldo -= comisionMensual;
        calcularInteres();
    }
    public void imprimir(){
        System.out.println("saldo: "+saldo);
        System.out.println("Numero Consignaciones: "+numeroConsignaciones);
        System.out.println("Numero Retiros: "+numeroRetiros);
        System.out.println("Tasa Anual: "+tasaAnual);
        System.out.println("Comision Mensual: "+comisionMensual);
    }

}
