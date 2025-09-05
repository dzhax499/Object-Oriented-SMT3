import id.ac.polban.model.Produk;
import id.ac.polban.service.*;
import java.util.Scanner;


public class KoperasiApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KoperasiService koperasi = KoperasiService.getInstance();

        private static void ProsesBelanja(Scanner input, KoperasiService koperasi) {
            koperasi.TampilMenu();
            
        }
        while (true) {
            System.out.println("\n========== APLIKASI KOPERASI ==========");
            System.out.println("1. Belanja");
            System.out.println("2. Lihat Riwayat Transaksi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            int menu = input.nextInt();

            switch (menu) {
                case 1 :
                    ProsesBelanja
            }
        }
    }
}