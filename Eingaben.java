import java.util.Scanner;

public class Eingaben {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Your name is " + name + " and your age is " + age);

        scanner.close();

    }

    
}
