package ECommerce;

import java.util.List;

public class Verkaeufer {

    int verkaeuferId;
    String verkaeuferName;
    List<Produkt> produkte;

    public Verkaeufer() {
    }

    public Verkaeufer(int verkaeuferId, String verkaeuferName, List<Produkt> produkte) {
        this.verkaeuferId = verkaeuferId;
        this.verkaeuferName = verkaeuferName;
        this.produkte = produkte;
    }

    public int getVerkaeuferId() {
        return verkaeuferId;
    }

    public void setVerkaeuferId(int verkaeuferId) {
        this.verkaeuferId = verkaeuferId;
    }

    public String getVerkaeuferName() {
        return verkaeuferName;
    }

    public void setVerkaeuferName(String verkaeuferName) {
        this.verkaeuferName = verkaeuferName;
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }

    @Override
    public String toString() {
        return "Verkaeufer [verkaeuferId=" + verkaeuferId + ", verkaeuferName=" + verkaeuferName + ", produkte="
                + produkte + "]";
    }
}
