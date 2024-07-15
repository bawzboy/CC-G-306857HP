package UML;

import java.util.List;

public class Bibliothek {
    String name;
    List <Buch> buecher;
    List <Mitglied> mitglieder;
    
    public Bibliothek(){
    }

    @Override
    public String toString() {
        return "Bibliothek Name: " + name + "\nBücher: " + "\n" + buecher + "\nMitglieder: " + mitglieder + "\n";
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
}
