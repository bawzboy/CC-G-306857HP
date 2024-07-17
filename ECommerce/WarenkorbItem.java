package ECommerce;

public class WarenkorbItem {

    Produkt produkt;
    Warenkorb warenkorb;
    double preis;
    int anzahl;

    public WarenkorbItem() {
    }

    public WarenkorbItem(Produkt produkt, Warenkorb warenkorb, double preis, int anzahl) {
        this.produkt = produkt;
        this.warenkorb = warenkorb;
        this.preis = preis;
        this.anzahl = anzahl;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    public Warenkorb getWarenkorb() {
        return warenkorb;
    }

    public void setWarenkorb(Warenkorb warenkorb) {
        this.warenkorb = warenkorb;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    @Override
    public String toString() {
        return "WarenkorbItem [produkt=" + produkt + ", warenkorb=" + warenkorb + ", preis=" + preis + ", anzahl="
                + anzahl + "]";
    }

}
