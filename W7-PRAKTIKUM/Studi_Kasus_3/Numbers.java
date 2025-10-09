// File: Numbers.java (Sudah diperbaiki)

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        // PERUBAHAN: Menggunakan Integer[] bukan int[]
        Integer[] intList;
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nBerapa banyak integer yang akan diurutkan? ");
        size = scan.nextInt();
        intList = new Integer[size];

        System.out.println("\nMasukkan angka-angka...");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt(); // Autoboxing mengubah int menjadi Integer
        }

        // Memanggil insertionSort untuk Bagian 4
        Sorting.insertionSort(intList);

        System.out.println("\nAngka-angka setelah diurutkan (menurun):");
        for (int i = 0; i < size; i++) {
            System.out.print(intList[i] + " ");
        }
        System.out.println();
    }
}
