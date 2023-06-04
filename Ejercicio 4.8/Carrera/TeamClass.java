package Carrera;

import java.util.*;
public class TeamClass {


private String name; 
private static double totalTime; 
private String country;
Vector competitorlist; 
public TeamClass(String name, String country) {
    this.name = name;
    this.country = country;
    totalTime = 0; 
    competitorlist = new Vector(); 
}
public String getname() {
    return name;
}
public void setname(String name) {
    this.name = name;
}
private String getcountry() {
    return name;
}
private void setcountry(String country) {
this.country = country;
}

void addbiker (Biker biker) {
competitorlist.add(biker); 
}
void listteam() {

for (int i = 0; i < competitorlist.size(); i++) {
Biker c = (Biker) competitorlist.elementAt(i); 
System.out.println(c.getname());
    }
}
void findbiker() {
System.out.println("Escriba el id de un competidor");
Scanner sc = new Scanner(System.in);
String Bikername = sc.next();
for (int i = 0; i < competitorlist.size(); i++) { 
Biker c = (Biker) competitorlist.elementAt(i);
if (c.getname().equals(Bikername)) {
System.out.println(c.getname());

}
  }
 }

void calculartotalTime() {
for (int i = 0; i < competitorlist.size(); i++) { 
Biker c = (Biker) competitorlist.elementAt(i); 
totalTime = totalTime + c.getacmtime();
    }
}
void print() {
System.out.println("Nombre del equipo = " + name);
System.out.println("Pais = " + country);
System.out.println("Total tiempo del equipo = " + totalTime);
}
}