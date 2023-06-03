package Inmuebles;

public class LocalComercial extends Local{
    protected String centroComercial;
    protected static double valorArea = 3000000;

    public LocalComercial(int identificadorInmobiliario, int area, String direccion,tipo tipoLocal, String centroComercial){
        super(identificadorInmobiliario,area,direccion,tipoLocal);
        this.centroComercial = centroComercial;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Centro comercial = "+ centroComercial);
        System.out.println();
    }
}
