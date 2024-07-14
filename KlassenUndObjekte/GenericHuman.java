package KlassenUndObjekte;

public class GenericHuman {
    
    public static String name;
    public static String firstName;
    public int birthdate;
    public static double budget;

    public GenericHuman(String name, String firstName, int yearOfBirth, double budget) {
        GenericHuman.name = name;
        GenericHuman.firstName = firstName;
        this.birthdate = yearOfBirth;
        GenericHuman.budget = budget;
    }

    public void buyCar(Car car) {
        if (GenericHuman.budget >= Car.price) {
            GenericHuman.budget =- Car.price;
            Car.owner = GenericHuman.name + " " + GenericHuman.firstName;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        GenericHuman.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        GenericHuman.firstName = firstName;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        GenericHuman.budget = budget;
    }

    
}
