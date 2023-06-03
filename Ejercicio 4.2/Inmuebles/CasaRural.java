package Inmuebles;

public class CasaRural extends Casa{

    protected static double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altitud;

    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos){
        super(identificadorInmobiliario,area,direccion,numeroHabitaciones,numeroBanos,numeroPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }

    void imprimir(){
        super.imprimir();
        System.out.println("Distancia la cabecera municipal = "+ distanciaCabera + "Km");
        System.out.println("Altitud sobre el nimer del mar = "+ altitud + "metros");
        System.out.println();
    }
}
