package Grundlagen;
public class Primitive2 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        short p = 200;
        int n = 500;
        long q = 100;
        float x = 2.5f;
        @SuppressWarnings("unused")
        double y = 5.25;

        // Aufgabe 1.
        //a) type = int
        System.out.println(b1 + b2);

        //b) type = int 
        System.out.println(p + b1);

        //c) type = int
        System.out.println(b1 * b2);

        //d) type = long
        System.out.println(q + p * (b1 + b2));

        //e) type = float
        System.out.println(x + q * n);

        //f) type = float
        System.out.println(b1 * q / x);

        //g) type = double
        System.out.println(b1 * q * 2. / x);

        //h) type = float
        System.out.println(b1 * q * 2.f / x);

    }
}
