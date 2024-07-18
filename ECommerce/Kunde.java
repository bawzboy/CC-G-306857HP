package ECommerce;

import java.util.List;

public class Kunde {

    private String name;
    private String adresse;
    private int kundenId;
    private String emailAdresse;
    private List<Bestellung> bestellungen;

    public Kunde() {
    }

    public Kunde(String name, String adresse, int kundenId, String emailAdresse, List<Bestellung> bestellungen) {
        this.name = name;
        this.adresse = adresse;
        this.kundenId = kundenId;
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

    @Override
    public String toString() {
        return "Kunde [name=" + name + ", adresse=" + adresse + ", kundenId=" + kundenId + ", emailAdresse="
                + emailAdresse + ", bestellungen=" + bestellungen + "]";
    }   
}
