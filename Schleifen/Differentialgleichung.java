package Schleifen;

import utils.IO;

public class Differentialgleichung {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        double t = 0.0;
        double dt = 1.0;
        double k = 0.1;
        double xn = 0.01;
        double dx = 0;
        // while (t < 100) {
        //     t = t + dt;
        //     dx = k * xn * (1 - xn) * dt;
        //     xn = xn + dx;
        //     IO.writeln(Math.round(t) + "\t" + xn);
        // }

        // Lösung des Dozenten zur Darstellung mit Sternen
        /*       
    	Erklärung der Variablen:

		t: 	Die aktuelle Zeit in der Simulation. Sie wird initial auf 0 gesetzt und in jedem Schritt der Schleife um den Zeitschritt dt erhöht.
		dt: Der Zeitschritt, mit dem die Zeit in der Simulation erhöht wird. Hier ist dt auf 1.0 gesetzt, was bedeutet, dass die Zeit in Einheiten von 1 Schritt verläuft.
		xn: Der momentane Bruchteil der kranken Bevölkerung zu einem gegebenen Zeitpunkt t. Der Anfangswert ist 0.01.
		k: 	Ein Maß für die Ansteckungsstärke. Hier ist k auf 0.1 gesetzt, was die Stärke der Ausbreitung der Krankheit angibt.
		dx: Der Änderungsbetrag von xn pro Zeitschritt, basierend auf der Differentialgleichung. Er wird in jedem Schritt der Schleife neu berechnet.
    	
    	*/
    	
    	while (t <= 100) {
    		t = t + dt;						// x-Axis
    		dx = k * xn * (1 - xn) * dt;
    		xn = xn + dx; 					// y-Axis
    		
    		
    		/*
    		Der Bruchteil der kranken Bevölkerung xn liegt im Bereich von 0 bis 1. 
    		Um diesen Bruchteil grafisch darzustellen, wird xn mit 50 multipliziert, um eine geeignete Anzahl an Sternen (*) zu erhalten. 
    		Der resultierende Wert wird auf die nächste ganze Zahl abgerundet (durch das Casten zu int),um die Anzahl der Sterne zu bestimmen.
			*/
    		int m = (int) (xn * 50);
    		for(int i = 1; i<= m; i++) {
    			IO.write("*");
    		}
    		IO.writeln();
    	}
    }    	
}

