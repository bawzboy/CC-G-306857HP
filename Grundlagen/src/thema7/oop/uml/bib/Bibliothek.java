package thema7.oop.uml.bib;

import java.util.List;

public class Bibliothek {

	private String name;
	
	private List<Buch> buecher; 
	
	private List<Mitglied> mitglieder;
	
	public Bibliothek() {
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Buch> getBuecher() {
		return buecher;
	}
	
	public void setBuecher(List<Buch> buecher) {
		this.buecher = buecher;
	}
	
	public List<Mitglied> getMitglieder() {
		return mitglieder;
	}
	
	public void setMitglieder(List<Mitglied> mitglieder) {
		this.mitglieder = mitglieder;
	}

	@Override
	public String toString() {
		return "Bibliothek [name=" + name + ", buecher=" + buecher + ", mitglieder=" + mitglieder + "]\n";
	}
	
	
}
