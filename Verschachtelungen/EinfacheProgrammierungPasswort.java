package Verschachtelungen;

public class EinfacheProgrammierungPasswort {
    public static void main(String[] args) {
        
        String [] passwords = {"Pass1234", "123456", "passwort", "abc"};

        for (int i = 0; i < passwords.length; i++) {
            if (isStrong(passwords[i])) {
                System.out.println("Password " + (i + 1) + " is strong!");
            }
        }
    }

    public static boolean isStrong(String password) {
        boolean strong = false;
        if (checkPasswordLength(password) && containsDigit(password)) {
        strong = true;
        }
        return strong;
    }

    public static boolean checkPasswordLength(String pw) {
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
                break;
            }
        }
        return digit;
    }
}
