package Verschachtelungen;

public class EinfacheProgrammierungPasswort {
    public static void main(String[] args) {
        
        String [] passwoerter = {"Pass1234", "123456", "passwort", "abc"};

        for (int i = 0; i < passwoerter.length; i++) {
            if (isStrong(passwoerter[i])) {
                System.out.println("Password " + (i + 1) + " is strong!");
            }
        }
    }

    public static boolean isStrong(String password) {
        boolean strong = false;
        if (passwordLength(password) && containsDigit(password)) {
        strong = true;
        }
        return strong;
    }

    public static boolean passwordLength(String pw) {
        boolean length = false;
        if (pw.length() >= 8) {
            length = true;
        }
        return length;
    }
    
    public static boolean containsDigit(String pw) {
        boolean digit = false;
        for (int i = 0; i < pw.length(); i++) {
            if (Character.isDigit(pw.charAt(i))) {
                digit = true;
            }
        }
        return digit;
    }
}
