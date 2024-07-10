package Rekursion;

import utils.IO;

public class ReversedString {
    public static void main(String[] args) {
        String originalMessage = IO.promptAndReadString("Your message? ");
        String reversedMessage = reversedString(originalMessage, originalMessage.length());
        System.out.println("The string reversed is: " + reversedMessage);
    }
    public static String reversedString(String message, int messageLength) {
        if (messageLength == 0) {
            return ".";
        }
        return message.charAt(messageLength - 1) + reversedString(message, messageLength - 1); // print last char, then repeat method
        // return reversedString(message, messageLength - 1) + message.charAt(messageLength - 1); // prints the original, why?
    }
}
