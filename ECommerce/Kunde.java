package ECommerce;

import java.util.List;

public class Kunde {
    
    String name;
    String adresse;
    int kundenId;
    String emailAdresse;
    List<Bestellung> bestellungen;

    public Kunde() {
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
    public int getKundenId() {
        return kundenId;
    }
    public void setKundenId(int kundenId) {
        this.kundenId = kundenId;
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
}
