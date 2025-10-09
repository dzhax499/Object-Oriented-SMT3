// File: Strings.java (File Baru)

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        String[] stringList;
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nBerapa banyak string yang akan diurutkan? ");
        size = scan.nextInt();
        stringList = new String[size];

        System.out.println("\nMasukkan string...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.next();
        }

        // Memanggil insertionSort untuk Bagian 4
        Sorting.insertionSort(stringList);

        System.out.println("\nString setelah diurutkan (menurun):");
        for (int i = 0; i < size; i++) {
            System.out.print(stringList[i] + " ");
        }
        System.out.println();
    }
}
