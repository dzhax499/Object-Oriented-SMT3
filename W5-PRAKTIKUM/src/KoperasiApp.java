
import id.ac.polban.model.Produk;
import id.ac.polban.service.KoperasiManager;
import id.ac.polban.service.Transaksi;
import java.util.Scanner;

/**
 * KoperasiApp adalah kelas utama untuk menjalankan aplikasi koperasi sederhana.
 * Mengelola interaksi user, proses belanja, dan menampilkan riwayat transaksi.
 */
public class KoperasiApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Mendapatkan instance KoperasiManager (Singleton)
        KoperasiManager koperasi = KoperasiManager.getInstance();

        while (true) {
            System.out.println("\n========== APLIKASI KOPERASI ==========");
            System.out.println("1. Belanja");
            System.out.println("2. Lihat Riwayat Transaksi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    ProsesBelanja(input, koperasi);
                    break;
                case 2:
                    koperasi.tampilkanRiwayatTransaksi();
                    break;
                case 3:
                    System.out.println("sampai jumpa... :)");
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }

    /**
     * Metode untuk memproses alur belanja produk.
     *
     * @param input Objek Scanner untuk input user.
     * @param koperasi Objek KoperasiManager untuk mengelola data.
     */
    private static void ProsesBelanja(Scanner input, KoperasiManager koperasi) {
        koperasi.TampilMenu();

        System.out.print("Pilih barang : ");
        int pilihan = input.nextInt();

        // Error handling atau validasi pilihan
        if (!koperasi.validasiPilihan(pilihan)) {
            System.out.println("Pilihan tidak tersedia");
            return;
        }

        // Ambil Barang yang dipilih
        Produk produkdipilih = koperasi.getProd(pilihan);
        if (produkdipilih == null) {
            System.out.println("Produk tidak ditemukan, silakan pilih kembali.");
            return;
        }

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
            return;
        }

        // buat transaksi
        Transaksi transaksi = new Transaksi(produkdipilih, jumlah);

        // proses pembelian
        if (transaksi.ProsesTransaksi()) {
            transaksi.cetakStruk();
            koperasi.tambahTransaksi(transaksi);
            System.out.println("TRANSAKSI BERHASIL... :)");
        } else {
            System.out.println("TRANSAKSI GAGAL... :(");
        }
    }
}
