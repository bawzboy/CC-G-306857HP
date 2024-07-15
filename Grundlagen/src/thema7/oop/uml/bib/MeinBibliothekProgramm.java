package thema7.oop.uml.bib;

import java.util.ArrayList;
import java.util.List;

public class MeinBibliothekProgramm {

	public static void main(String[] args) {

		Bibliothek meineBibliothek = new Bibliothek();
		meineBibliothek.setName("Stadtbiobliothek");
		
		List<Buch> meineBuecher = new ArrayList<Buch>();
		Buch buch1 = new Buch("Java ist eine Insel", "Autor 1", "123");
		meineBuecher.add(buch1);
		Buch buch2 = new Buch("Clean Code", "Autor 2", "456");
		meineBuecher.add(buch2);
		Buch buch3 = new Buch("Clean Architecture", "Autor 3", "789");
		meineBuecher.add(buch3);
		
		meineBibliothek.setBuecher(meineBuecher);

		List<Buch> mitglied1Buecher = new ArrayList<Buch>();
		mitglied1Buecher.add(buch1);
		Mitglied mitglied1 = new Mitglied("Andreas", "001", mitglied1Buecher);

		
		List<Buch> mitglied2Buecher = new ArrayList<Buch>();
		mitglied2Buecher.add(buch2);
		mitglied2Buecher.add(buch3);
		Mitglied mitglied2 = new Mitglied("Markus", "002", mitglied2Buecher);
		Mitglied mitglied3 = new Mitglied("John", "003", null);
		
		List<Mitglied> bibMitglieder = new ArrayList<Mitglied>();
		bibMitglieder.add(mitglied1);
		bibMitglieder.add(mitglied2);
		bibMitglieder.add(mitglied3);
		meineBibliothek.setMitglieder(bibMitglieder);
		
		System.out.println(meineBibliothek);
	}

}
