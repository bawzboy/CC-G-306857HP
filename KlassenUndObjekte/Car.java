package KlassenUndObjekte;

public class Car {

    public String make;
    public String model;
    public String color;
    public int year;
    public int mileage;
    public static double price;
    public static String owner;


    public Car(String make, String model, String color, int year, int mileage, double price, String owner){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        Car.price = price;
        Car.owner = owner;
    }

    @Override
    public String toString() {
        return "make= " + make + ", model= " + model + ", year= " + year + ", mileage= " + mileage + ", price= " + price + ", owner= " + owner;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        Car.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        Car.owner = owner;
    }

    
    
}
