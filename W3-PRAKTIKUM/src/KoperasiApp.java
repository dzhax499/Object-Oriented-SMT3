import id.ac.polban.model.Produk;
import id.ac.polban.service.KoperasiManager;
import id.ac.polban.service.Transaksi;
import java.util.Scanner;


public class KoperasiApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KoperasiManager koperasi = KoperasiManager.getInstance(); //depedency : main uses KoperasiManager

        while (true) {
            System.out.println("\n========== APLIKASI KOPERASI ==========");
            System.out.println("1. Belanja");
            System.out.println("2. Lihat Riwayat Transaksi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            int menu = input.nextInt();

            switch (menu) {
                case 1 :
                    ProsesBelanja(input, koperasi);
                case 2 :
                    koperasi.tampilkanRiwayatTransaksi();
                case 3 :
                    System.out.println("sampai jumpa... :)");
                    break;
            }
        }
    }

    private static void ProsesBelanja(Scanner input, KoperasiManager koperasi) {
            koperasi.TampilMenu();

            System.out.print("Pilih barang : ");
            int pilihan = input.nextInt();

            //error handling atau validasi pilihan nya
            if (!koperasi.validasiPilihan(pilihan)) {
                System.out.println("Pilihan tidak tersedia");
                return;
            }

            // Ambil Barang yang dipilih
            Produk produkdipilih = koperasi.getProd(pilihan);  //depedency

            // jumlah?
            System.out.print("Jumlah Barang : ");
            int jumlah = input.nextInt();

            if (jumlah <= 0) {
                System.out.println("Jumlah Tidak boleh kurang dari 1.... :) ");
                return;
            }

            // cek stok
            if (produkdipilih.Getstok_prod() < jumlah) {
                System.out.println("Jumlah stok tidak mencukup....  :) cuma ada stok : " + produkdipilih.Getstok_prod());
            }

            // buat transaksi

            Transaksi transaksi = new Transaksi(produkdipilih , jumlah);
             
            // proses pembelian

            if (transaksi.ProsesTransaksi()){
                transaksi.cetakStruk();
                koperasi.tambahTransaksi(transaksi); //AGGREGATION: simpan ke collection
                System.out.println("TRANSAKSI BERHASIL... :)");
            } else {
                System.out.println("TRANSAKSI GAGAL... :(");
            }


            
        }  
}