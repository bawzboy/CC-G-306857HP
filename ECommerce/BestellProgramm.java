package ECommerce;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BestellProgramm {
    public static void main(String[] args) {

        Verkaeufer haendler = new Verkaeufer(1, "haendler", null);
        Produkt produktEins = new Produkt(1, "produktEins", 1.99);
        Produkt produktZwei = new Produkt(2, "produktZwei", 2.99);

        List<Produkt> produktListe = new ArrayList<Produkt>();
        produktListe.add(produktEins);
        produktListe.add(produktZwei);
        haendler.setProdukte(produktListe);
        
        Kunde testKunde = new Kunde("T. Kunde", "Zu Hause", 1, "bla@.com", null);
        
        Bestellung testBestellung = new Bestellung(1, testKunde, 0, null, new Date());
        List<Bestellung> testKundenBestellungen = new ArrayList<Bestellung>();
        testKundenBestellungen.add(testBestellung);
        testKunde.setBestellungen(testKundenBestellungen);
        
        Warenkorb testWarenkorb = new Warenkorb(null, 0, testKunde);
        
        WarenkorbItem itemEins = new WarenkorbItem(produktEins, testWarenkorb, produktEins.preis, 5);
        WarenkorbItem itemZwei = new WarenkorbItem(produktZwei, testWarenkorb, produktZwei.preis, 3);

        testWarenkorb.addItem(itemEins);
        testWarenkorb.addItem(itemZwei);
        testWarenkorb.setGesamtbetrag(testWarenkorb.gesamtbetrag(testWarenkorb.warenkorbItems));
        System.out.println(testWarenkorb);
        
        
    }
}
