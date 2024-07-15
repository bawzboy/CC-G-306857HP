package thema7.oop.uml.bib;

import java.util.ArrayList;
import java.util.List;

public class MeinBibliothekProgramm {

	public static void main(String[] args) {

		Bibliothek meineBibliothek = new Bibliothek();
		meineBibliothek.setName("Stadtbiobliothek");
		
		List<Buch> meineBuecher = new ArrayList<Buch>();
		meineBuecher.add(new Buch("Java ist eine Insel", "Autor 1", "123"));
		meineBuecher.add(new Buch("Clean Code", "Autor 2", "456"));
		meineBuecher.add(new Buch("Clean Architecture", "Autor 3", "789"));
		
		meineBibliothek.setBuecher(meineBuecher);
		meineBibliothek.setMitglieder(null);
		
		System.out.println(meineBibliothek);
	}

}
