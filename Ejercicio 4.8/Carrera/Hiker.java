
package Carrera;


public class Hiker extends Biker {

private double avgacc;

private double rampgrad;

public Hiker(int id, String name, double
avgacc, double gradoRampa) {
super(id, name);
this.avgacc = avgacc;
this.rampgrad = rampgrad;
}
protected double getavgacc() {
return avgacc;
}

protected void setavgacc(double
avgacc) {
this.avgacc = avgacc;
}
protected double getrampgrad() {
return rampgrad;
}
protected void setrampgrad(double rampgrad) {
this.rampgrad = rampgrad;
}

protected void print() {
super.print(); 
System.out.println("Aceleración promedio = " +
avgacc);
System.out.println("Grado de rampa = " + rampgrad);
}

protected String printtype() {
System.out.println("Es un escalador");    
return "Es un escalador";
}
}