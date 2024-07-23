package ECommerce;

import java.util.List;

public class Kunde extends Person {


    private List<Bestellung> bestellungen;

    public Kunde() {
    }

    public Kunde(String name, String adresse, int id, String emailAdresse, List<Bestellung> bestellungen) {
        this.name = name;
        this.adresse = adresse;
        this.id = id;
        this.emailAdresse = emailAdresse;
        this.bestellungen = bestellungen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int kundenId) {
        this.id = kundenId;
    }

    public String getEmailAdresse() {
        return emailAdresse;
    }

    public void setEmailAdresse(String emailAdresse) {
        this.emailAdresse = emailAdresse;
    }

    public List<Bestellung> getBestellungen() {
        return bestellungen;
    }

    public void setBestellungen(List<Bestellung> bestellungen) {
        this.bestellungen = bestellungen;
    }

    @Override
    public String toString() {
        return "Kunde [name=" + name + ", adresse=" + adresse + ", kundenId=" + id + ", emailAdresse="
                + emailAdresse + ", bestellungen=" + bestellungen + "]";
    }

    @Override
    public int getPlz() {
        throw new UnsupportedOperationException("Unimplemented method 'getPlz'");
    }   
}
