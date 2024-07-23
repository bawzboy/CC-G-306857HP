package ECommerce;

import java.util.List;

public class Verkaeufer extends Person {


    List<Produkt> produkte;

    public Verkaeufer() {
    }

    public Verkaeufer(int id, String name, List<Produkt> produkte) {
        this.id = id;
        this.name = name;
        this.produkte = produkte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVerkaeuferName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }

    @Override
    public String toString() {
        return "Verkaeufer [verkaeuferId=" + id + ", verkaeuferName=" + name + ", produkte="
                + produkte + "]";
    }

    @Override
    public int getPlz() {
        throw new UnsupportedOperationException("Unimplemented method 'getPlz'");
    }

    @Override
    public String getAdresse() {
        throw new UnsupportedOperationException("Unimplemented method 'getAdresse'");
    }

}
