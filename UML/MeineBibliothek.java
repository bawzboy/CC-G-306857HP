package UML;

import java.util.ArrayList;
import java.util.List;

public class MeineBibliothek {
    public static void main(String[] args) {
        
        Bibliothek Stadtbibliothek = new Bibliothek();
        Stadtbibliothek.setName("Stadtbibliothek");

        List<Buch> Buecher = new ArrayList<Buch>();
        Buch buch1 = new Buch("Java ist eine Insel", "Autor 1", "123");
        Buch buch2 = new Buch("Clean Code", "Autor 2", "456");
        Buch buch3 = new Buch("Clean Architecture", "Autor 3", "789");

        Buecher.add(buch1);
        Buecher.add(buch2);
        Buecher.add(buch3);

        List<Buch> BuecherMitglied1 = new ArrayList<Buch>();
        BuecherMitglied1.add(buch1);
        BuecherMitglied1.add(buch2);
        List<Buch> BuecherMitglied2 = new ArrayList<Buch>();
        BuecherMitglied2.add(buch3);

        List<Mitglied> Mitglieder = new ArrayList<Mitglied>();
        Mitglied mitglied1 = new Mitglied("Mitglied 1", "M001", BuecherMitglied1);
        Mitglied mitglied2 = new Mitglied("Mitglied 2", "M002", BuecherMitglied2);

        Mitglieder.add(mitglied1);
        Mitglieder.add(mitglied2);

        Stadtbibliothek.setBuecher(Buecher);
        Stadtbibliothek.setMitglieder(Mitglieder);

        System.out.println(Stadtbibliothek);
    }
}
