package ECommerce;

public abstract class Person implements Identifizierbar{

    int id;
    String name;
    String emailAdresse;
    String adresse;
    int plz;

    public String gibAdresseUndPlz() {
        String adresseUndPlz = adresse + plz;
        return adresseUndPlz;
    }

    public int getId() {
        int id = 1;
        return id;
    }
}