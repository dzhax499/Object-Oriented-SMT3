import java.util.Scanner;

public class Soal5_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan String A: ");
        String A = scanner.nextLine();
        System.out.print("Masukan Sting B: ");
        String B = scanner.nextLine();
        
        // Jumlahkan length A dan B
        int totalLength = A.length() + B.length();
        System.out.println("Total Length: " + totalLength);
        
        // pengecekan A adalah lexicographically dari B bukan
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // Kapitalkan huruf pertama setiap string nya
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
        
        scanner.close();
    }
}