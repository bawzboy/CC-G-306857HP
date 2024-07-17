package ECommerce;

public class Produkt {

    int produktId;
    String bezeichnung;
    double preis;

    public Produkt() {
    }

    public Produkt(int produktId, String bezeichnung, double preis) {
        this.produktId = produktId;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public int getProduktId() {
        return produktId;
    }

    public void setProduktId(int produktId) {
        this.produktId = produktId;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Produkt [produktId=" + produktId + ", bezeichnung=" + bezeichnung + ", preis=" + preis + "]";
    }

}
