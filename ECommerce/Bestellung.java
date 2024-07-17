package ECommerce;

import java.util.Date;

public class Bestellung {

    int bestellId;
    Kunde kunde;
    double gesamtbetrag;
    Warenkorb warenkorb;
    Date datum;

    public Bestellung() {
    }

    public Bestellung(int bestellId, Kunde kunde, double gesamtbetrag, Warenkorb warenkorb, Date datum) {
        this.bestellId = bestellId;
        this.kunde = kunde;
        this.gesamtbetrag = gesamtbetrag;
        this.warenkorb = warenkorb;
        this.datum = datum;
    }

    public String bestellinfo() {
        String bestellinfo = "" + bestellId + kunde + warenkorb;
        return bestellinfo;
    }

    public int getBestellId() {
        return bestellId;
    }

    public void setBestellId(int bestellId) {
        this.bestellId = bestellId;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public double getGesamtbetrag() {
        return gesamtbetrag;
    }

    public void setGesamtbetrag(double gesamtbetrag) {
        this.gesamtbetrag = gesamtbetrag;
    }

    public Warenkorb getWarenkorb() {
        return warenkorb;
    }

    public void setWarenkorb(Warenkorb warenkorb) {
        this.warenkorb = warenkorb;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Bestellung [bestellId=" + bestellId + ", kunde=" + kunde + ", gesamtbetrag=" + gesamtbetrag
                + ", warenkorb=" + warenkorb + ", datum=" + datum + "]";
    }

}
