/**
 * CSC 207-02 (Spring 2025)
 * Project 1: Classical Encryption
 * 
 * Adarsh Sharma
 * sharmaad@grinnell.edu
 * 
 * Acknowledgements:
 * 1. java 21.0.1 2023-10-17 LTS
 * 2. VS Code 1.96.4
 * 3. TTAP: Data Structures - Lab Manual
 * 4. W3schools: https://www.w3schools.com/java/java_ref_string.asp
 * 5. Prof. Peter Osera
 */

public class Encryption {

    // custom error messages for invalid input
    public static void main(String[] args) {

        // if the number of arguments are less than or greater than 2
        if (args.length != 2) {
            System.out.println("Usage: java CaeserCipher <encode|decode> <text>");
            System.out.println();
            return;
        }

        // error if there are any non-lowercase english characters
        for (int i = 0; i < args[1].length(); i++) {
            // System.out.println(args[1].charAt(i));
            if (args[1].charAt(i) < 97 || args[1].charAt(i) > 122) {
                System.out.println("Usage: java CaeserCipher <encode|decode> <text>");
                System.out.println();
                return;
            }
        }

        if (args[0].equals("decode") || args[0].equals("encode")) {
            printCodedStrings(args[0], args[1]);
            System.out.println();
        } else {
            System.out.println("Usage: java CaeserCipher <encode|decode> <text>");
            System.out.println();
        }
    }

    // printing the output for both encoding and decoding
    public static void printCodedStrings(String choice, String inputString) {
        if (choice.equals("encode")) {
            for (int i = 0; i <= 25; i++) {
                System.out.println("n = " + i + ": " + encode(i, inputString));
            }
        } else if (choice.equals("decode")) {
            for (int i = 0; i <= 25; i++) {
                System.out.println("n = " + i + ": " + decode(i, inputString));
            }
        }
    }

    // fn to encode a given string by value n
    public static String encode(int n, String s) {
        s = s.toLowerCase();
        int length = s.length();
        String encodedString = "";

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            int currentChar = (int) ch - 97;

            char encodedChar = (char) ((currentChar + n) % 26 + 97);
            encodedString = encodedString + encodedChar;
        }

        return encodedString;
    }

    // fn to decode a given string by value n
    public static String decode(int n, String s) {

        s = s.toLowerCase();
        int length = s.length();
        String decodedString = "";

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            int currentChar = (int) ch - 97;

            char decodedChar = (char) ((currentChar - (n % 26) + 26) % 26 + 97);
            decodedString = decodedString + decodedChar;
        }

        return decodedString;
    }
}