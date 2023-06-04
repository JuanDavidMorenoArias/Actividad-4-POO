package Carrera;


public class Speeder extends Biker {
private double avgpotency; 

private double avgspeed;

public Speeder(int id, String name, double
avgpotency, double avgspeed) {
super(id, name);
avgpotency = avgpotency;
this.avgspeed = avgspeed;
}
protected double getavgpotency() {
return avgpotency;
}

protected void setavgpotency(double avgpotency) {
this.avgpotency = avgpotency;
}

protected double getavgspeed() {
return avgspeed;
}

protected void setavgspeed(double avgspeed) {
this.avgspeed = avgspeed;
}

protected void print() {
super.print(); 
System.out.println("Potencia promedio = " + avgpotency);
System.out.println("Velocidad promedio = " +
avgspeed);
}

protected String printtype() {
return "Es un velocista";
}
}