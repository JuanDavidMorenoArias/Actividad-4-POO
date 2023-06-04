
package Carrera;


public abstract class Biker {
private int id; 
private String name;
private int acmtime = 0; 

public Biker (int id, String name) {
this.id = id;
this.name = name;
    }
abstract String printtype();

protected int getid() {
return id;
}
protected void setid() {
this.id= id;
}
protected String getname() {
return name;
}

protected void setname(String name) {
this.name = name;
}

protected int getgeneralposition(int generalposition) {
return generalposition;
}

protected void setgeneralposition(int generalposition) {
generalposition = generalposition;
}

protected int getacmtime() {
return acmtime;
}
protected void setacmtime(int acmtime) {
this.acmtime = acmtime;
}
/**
* Método muestra en pantalla los datos de un ciclista
*/
protected void print() {
System.out.println("Identificador = " + id);
System.out.println("Nombre ="  + name);
System.out.println("Tiempo Acumulado = " +
acmtime);
}
}