package thema7.oop.uml.bib;

import java.util.List;

public class Bibliothek {

	private String name;
	
	private List<Buch> buecher; 
	
	private List<Mietglied> mitglieder;
	
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
	
	public List<Mietglied> getMitglieder() {
		return mitglieder;
	}
	
	public void setMitglieder(List<Mietglied> mitglieder) {
		this.mitglieder = mitglieder;
	}
	
	@Override
	public String toString() {
		
		String textToReturn = "Name = " + this.name;
		textToReturn += "\nBuecher = ";
		
		// for(Buch name : this.buecher) {
			// textToReturn + " "
		// }
		
		
		return textToReturn;
	}
}
