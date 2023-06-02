package CuentaBancaria;

public class CuentaCorriente extends Cuenta{
    private float sobregiro;


    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro = 0;
    }
    public void retirar(float cantidad){
        if (cantidad > saldo){
            sobregiro += cantidad - saldo;
            saldo = 0;
        }else{
            saldo -= cantidad;
        }
    }
    public void consignar(float cantidad){
        float residuo = cantidad - sobregiro;
        if (sobregiro > 0){
            if (residuo > 0){
                saldo = residuo;
                sobregiro = 0;
            }else{
                sobregiro = -residuo;
                saldo = 0;
            }
        }else{
            super.consignar(cantidad);
        }

    }
    public void extractoMensual(){
        super.extractoMensual();
    }

    public void imprimir(){
        System.out.println("su saldo es: "+saldo);
        System.out.println("comision mensual: "+comisionMensual);
        System.out.println("cant. transacciones: "+ (numeroRetiros+ numeroConsignaciones));
        System.out.println("su sobregiro es: "+sobregiro);
    }

}
