
package Carrera;

public class Trial {

public static void main(String args[]) {
TeamClass equipo1 = new TeamClass("Sky","Estados Unidos");
Speeder velocista1 = new Speeder(123979, "Geraint Thomas",
320, 25);
Hiker escalador1 = new Hiker(123980, "Egan Bernal",
25, 10);
Timerunner contrarrelojista1 = new Timerunner(123981,
"Jonathan Castroviejo", 120);
equipo1.addbiker(velocista1);
equipo1.addbiker(escalador1);
equipo1.addbiker(contrarrelojista1);
velocista1.setacmtime(365);
escalador1.setacmtime(385);
contrarrelojista1.setacmtime(370);
equipo1.calculartotalTime();
equipo1.print();
equipo1.listteam();
equipo1.findbiker();
}
}
