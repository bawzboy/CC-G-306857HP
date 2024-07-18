package ECommerce;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {

    List<WarenkorbItem> warenkorbItems = new ArrayList<WarenkorbItem>();
    double gesamtbetrag;
    Kunde kunde;

    public Warenkorb() {
        this.warenkorbItems = new ArrayList<WarenkorbItem>();
    }

    public Warenkorb(List<WarenkorbItem> warenkorbItems, double gesamtbetrag, Kunde kunde) {
        this.warenkorbItems = new ArrayList<WarenkorbItem>();
        this.gesamtbetrag = gesamtbetrag;
        this.kunde = kunde;
    }

    public double gesamtbetrag(List<WarenkorbItem> warenkorbItems) {
        double gesamtbetrag = 0;
        for (int i = 0; i < warenkorbItems.size(); i++) {
            gesamtbetrag += (warenkorbItems.get(i).anzahl * warenkorbItems.get(i).preis);
        }
        return gesamtbetrag;
    }

    public void addItem(WarenkorbItem warenkorbItem) {
        this.warenkorbItems.add(warenkorbItem);
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
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    @Override
    public String toString() {
        return "Warenkorb [warenkorbItems=" + warenkorbItems.size() + ", gesamtbetrag=" + gesamtbetrag + ", Kunde=" + kunde.getKundenId() + "]";
    }

}
