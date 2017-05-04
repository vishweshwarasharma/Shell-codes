package Assigment1;
import java.util.Scanner;

public class Rot13 {

    public static String rot13(String value) {

        char[] values = value.toCharArray();
        for (int i = 0; i < values.length; i++) {
            char letter = values[i];

            if (letter >= 'a' && letter <= 'z') {
                // Rotate lowercase letters.

                if (letter > 'm') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            } else if (letter >= 'A' && letter <= 'Z') {
                // Rotate uppercase letters.

                if (letter > 'M') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            }
            values[i] = letter;
        }
        // Convert array to a new String.
        return new String(values);
    }

    public static void main(String[] args) {

        // Rotate the input string.
        // ... Then rotate the rotated string.
    	String input = new String();
    	  Scanner sc = new Scanner(System.in);
          System.out.println("Enter the String for Encryption: ");
         
          input = sc.next();
        String rot13 = rot13(input);
        String roundTrip = rot13(rot13);
        System.out.println("Enchrypted text");
        System.out.println(rot13);
        System.out.println("Decrypted text");
        System.out.println(roundTrip);
    }
}