package ECommerce;

import java.util.ArrayList;
import java.util.List;

public class BestellProgramm {
    public static void main(String[] args) {

        Verkaeufer haendler = new Verkaeufer(1, "haendler", null);
        Produkt produktEins = new Produkt(1, "produktEins", 1.99);
        Produkt produktZwei = new Produkt(2, "produktZwei", 2.99);
        List<Produkt> produktListe = new ArrayList<Produkt>();  // why use list and arraylist instead of just arraylist???
        produktListe.add(produktEins);
        produktListe.add(produktZwei);
        haendler.setProdukte(produktListe);

        
    
    }
}
