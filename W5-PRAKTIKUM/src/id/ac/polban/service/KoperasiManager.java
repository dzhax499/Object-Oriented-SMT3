package id.ac.polban.service;

import id.ac.polban.model.Produk;
import id.ac.polban.model.ProdukDiskon; // Import kelas ProdukDiskon
import java.util.ArrayList;
import java.util.List;

/**
 * Kelas KoperasiManager mengelola data produk dan riwayat transaksi koperasi.
 * Mengimplementasikan pola Singleton untuk memastikan hanya ada satu instance.
 */
public class KoperasiManager {

    private List<Produk> daftarProd;
    private List<Transaksi> riwayatTransaksi;

    // STATIC VARIABLES (Singleton Pattern)
    private static KoperasiManager instance;

    // static method
    /**
     * Mengembalikan instance tunggal dari KoperasiManager (Singleton).
     *
     * @return Instance KoperasiManager.
     */
    public static KoperasiManager getInstance() {
        if (instance == null) {
            instance = new KoperasiManager();
        }
        return instance;
    }

    /**
     * Konstruktor privat untuk mencegah instansiasi dari luar.
     */
    private KoperasiManager() {
        daftarProd = new ArrayList<>();
        riwayatTransaksi = new ArrayList<>();
        isi_prod();
    }

    /**
     * Mengisi daftar produk dengan beberapa item default. Ditambahkan objek
     * ProdukDiskon baru.
     */
    private void isi_prod() {
        daftarProd.add(new Produk("Pulpen", 3500, 10));
        daftarProd.add(new Produk("Buku", 7000, 15));
        daftarProd.add(new Produk("Pensil", 3000, 7));
        daftarProd.add(new Produk("Penghapus", 2000, 20));
        // Tambahan: Contoh produk diskon untuk demonstrasi Inheritance
        daftarProd.add(new ProdukDiskon("Pulpen Diskon", 3500, 5, 10.0));
    }

    /**
     * Mengembalikan daftar produk yang tersedia.
     *
     * @return List objek Produk.
     */
    public List<Produk> getDaftarProd() {
        return daftarProd;
    }

    /**
     * Menampilkan menu produk kepada pengguna.
     */
    public void TampilMenu() {
        System.out.println("========== MENU PRODUK KOPERASI ==========");
        for (int i = 0; i < daftarProd.size(); i++) {
            System.out.println((i + 1) + ". " + daftarProd.get(i).toString());
        }
        System.out.println("==========================================");
        System.out.println("Total jenis produk: " + Produk.GetTotalProduk());
        System.out.println("==========================================");
    }

    /**
     * Mendapatkan objek Produk berdasarkan pilihan indeks.
     *
     * @param index Pilihan indeks dari menu.
     * @return Objek Produk jika valid, null jika tidak.
     */
    public Produk getProd(int index) {
        if (index >= 1 && index <= daftarProd.size()) {
            return daftarProd.get(index - 1);
        }
        return null;
    }

    /**
     * Melakukan validasi pilihan menu produk dari user.
     *
     * @param pilihan Pilihan menu yang dimasukkan user.
     * @return True jika pilihan valid, false sebaliknya.
     */
    public boolean validasiPilihan(int pilihan) {
        return pilihan >= 1 && pilihan <= daftarProd.size();
    }

    /**
     * Melakukan validasi stok produk.
     *
     * @param produk Objek produk yang dipilih.
     * @param jumlah Jumlah yang ingin dibeli.
     * @return True jika stok mencukupi, false sebaliknya.
     */
    public boolean validasiStok(Produk produk, int jumlah) {
        return produk.Getstok_prod() >= jumlah;
    }

    /**
     * Menambahkan transaksi ke dalam riwayat.
     *
     * @param transaksi Objek transaksi yang akan ditambahkan.
     */
    public void tambahTransaksi(Transaksi transaksi) {
        riwayatTransaksi.add(transaksi);
    }

    /**
     * Menampilkan riwayat transaksi yang telah dilakukan.
     */
    public void tampilkanRiwayatTransaksi() {
        System.out.println("========== RIWAYAT TRANSAKSI ==========");
        if (riwayatTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (Transaksi trx : riwayatTransaksi) {
                System.out.println("No: " + trx.getProd() + " | "
                        + trx.getProd().Getnama_prod() + " | "
                        + "Qty: " + trx.GetjumlahBeli() + " | "
                        + "Total: Rp." + trx.hitungTotal());
            }
        }
        System.out.println("=======================================");
    }
}
