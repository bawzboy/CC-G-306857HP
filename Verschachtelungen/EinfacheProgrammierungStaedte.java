package Verschachtelungen;

import utils.IO;

public class EinfacheProgrammierungStaedte {
    public static void main(String[] args) {
        double [] [] temperatures = {
            {20.5, 22.3, 19.8, 21.0, 23.1, 20.4, 18.7}, // Stadt 1
            {15.5, 17.2, 16.3, 14.8, 15.7, 16.0, 14.9}, // Stadt 2
            {16.2, 17.3, 18.4, 19.5, 20.6, 21.7, 22.8}  // Stadt 3
        };

        for (int i = 0; i < temperatures.length; i++) {
            double gesTemp = 0;
            for (int j = 0; j < temperatures[i].length; j++) {
                gesTemp = gesTemp + temperatures[i][j];
            }
            double avgTemp = gesTemp / temperatures[i].length;
            System.out.println("Stadt "+ i + " durchschnittliche Temperatur ist: " + IO.round(avgTemp, 2));
        }

    }
}
