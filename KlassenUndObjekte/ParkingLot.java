package KlassenUndObjekte;

public class ParkingLot {

    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "63S AMG", "red", 2023, 1337, 127000.0, "");
        // System.out.println(car1);
        GenericHuman human1 = new GenericHuman("P", "Helge", 1991, 1337000.0);

        human1.buyCar(car1);
        System.out.println(car1);
    }   
}
