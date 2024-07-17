package ECommerce;

import java.util.List;

public class Warenkorb {

    List<WarenkorbItem> warenkorbItems;
    double gesamtbetrag;
    Kunde Kunde;

    public Warenkorb() {
    }

    public Warenkorb(List<WarenkorbItem> warenkorbItems, double gesamtbetrag, Kunde kunde) {
        this.warenkorbItems = warenkorbItems;
        this.gesamtbetrag = gesamtbetrag;
        this.Kunde = kunde;
    }

    public double gesamtbetrag(List<WarenkorbItem> warenkorbItems) {
        double gesamtbetrag = 0;
        for (int i = 0; i < warenkorbItems.size(); i++) {
            gesamtbetrag += (warenkorbItems.get(i).anzahl * warenkorbItems.get(i).preis);
        }
        return gesamtbetrag;
    }

    public void addItem(WarenkorbItem warenkorbItem) {
    }

    public List<WarenkorbItem> getWarenkorbitems() {
        return warenkorbItems;
    }

    public void setWarenkorbitems(List<WarenkorbItem> warenkorbitems) {
        this.warenkorbItems = warenkorbitems;
    }

    public double getGesamtbetrag() {
        return gesamtbetrag;
    }

    public void setGesamtbetrag(double gesamtbetrag) {
        this.gesamtbetrag = gesamtbetrag;
    }

    public Kunde getKunde() {
        return Kunde;
    }

    public void setKunde(Kunde kunde) {
        Kunde = kunde;
    }

    @Override
    public String toString() {
        return "Warenkorb [warenkorbItems=" + warenkorbItems + ", gesamtbetrag=" + gesamtbetrag + ", Kunde=" + Kunde
                + "]";
    }

}
