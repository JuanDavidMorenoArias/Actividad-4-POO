package Carrera;


public  class Timerunner extends Biker {
private double maxspeed;

public Timerunner(int id, String name, double
maxspeed) {
super(id, name);
this.maxspeed = maxspeed;
}

protected double getmaxspeed() {
return maxspeed;
}
protected void setmaxspeed(double maxspeed) {
this.maxspeed = maxspeed;
}

protected void print() {
super.print();
System.out.println("aceleración promedio = " +
maxspeed);
}

protected String printtype() {
return "Es un constrarrelojista";
}
}
