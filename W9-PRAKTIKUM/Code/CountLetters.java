// **
// CountLetters.java
//
// Reads a words from the standard input and prints the number of
// occurrences of each letter in that word.
//
// **
import java.util.Scanner;

// public class CountLetters {
public class CountLetters {
    // public static void main(String[] args) {
    public static void main(String[] args) {
        // int[] counts = new int[26];
        int[] counts = new int[26];
        // Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        // System.out.print("Enter a single word (letters only, please): ");
        // Modifikasi untuk mencerminkan instruksi agar bisa memasukkan frasa
        System.out.print("Enter a phrase: ");
        // String word = scan.nextLine();
        String word = scan.nextLine();

        // //convert to all upper case
        // word = word.toUpperCase();
        word = word.toUpperCase();

        // //count frequency of each letter in string
        // for (int i=0; i < word.length(); i++) {
        for (int i=0; i < word.length(); i++) {
            // Put the body of the first for loop in a try.
            try {
                // counts[word.charAt(i)-'A']++;
                counts[word.charAt(i)-'A']++;
            // Add a catch that catches the exception
            } catch (ArrayIndexOutOfBoundsException e) {
                // In your print statement, replace the exception with the character that
                // created the out of bounds index.
                System.out.println("'" + word.charAt(i) + "' is not a letter.");
            }
        }

        // //print frequencies
        // System.out.println();
        System.out.println();
        // for (int i=0; i < counts.length; i++)
        for (int i=0; i < counts.length; i++)
            // if (counts[i] != 0)
            if (counts[i] != 0)
                // System.out.println((char)(i+'A') + ": " + counts[i]);
                System.out.println((char)(i+'A') + ": " + counts[i]);
    // }
    }
// }
}