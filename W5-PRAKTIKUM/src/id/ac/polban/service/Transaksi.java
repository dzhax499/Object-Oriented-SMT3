package id.ac.polban.service;

import id.ac.polban.model.Produk;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Kelas Transaksi merepresentasikan satu kali transaksi pembelian produk.
 */
public class Transaksi {

    private Produk produk;
    private int jumlahBeli;
    private LocalDateTime waktuTransaksi;

    // static variable
    private static int nomorTransaksi = 1; // auto-increment nomor

    /**
     * Konstruktor untuk membuat objek Transaksi baru.
     *
     * @param produk Objek produk yang dibeli.
     * @param jumlahBeli Jumlah unit yang dibeli.
     */
    public Transaksi(Produk produk, int jumlahBeli) {
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
        this.waktuTransaksi = LocalDateTime.now();
    }

    /**
     * Mengembalikan objek produk yang dibeli dalam transaksi ini.
     *
     * @return Objek Produk.
     */
    public Produk getProd() {
        return produk;
    }

    /**
     * Mengembalikan jumlah barang yang dibeli.
     *
     * @return Jumlah unit produk.
     */
    public int GetjumlahBeli() {
        return jumlahBeli;
    }

    /**
     * Menghitung total harga transaksi.
     *
     * @return Total harga.
     */
    public int hitungTotal() {
        return produk.Getharga_prod() * jumlahBeli;
    }

    //static Method
    /**
     * Membuat nomor transaksi yang unik secara auto-increment.
     *
     * @return String nomor transaksi.
     */
    public static String buatNomorTransaksi() {
        String nomor = "TRX -" + String.format("%03d", nomorTransaksi);
        nomorTransaksi++;
        return nomor;
    }

    /**
     * Memproses transaksi dengan mengurangi stok produk.
     *
     * @return True jika proses berhasil, false sebaliknya.
     */
    public boolean ProsesTransaksi() {
        return produk.kurangi_prod(jumlahBeli);
    }

    /**
     * Mencetak struk transaksi ke konsol.
     */
    public void cetakStruk() {
        System.out.println("========== STRUK KOPERASI ==========");
        System.out.println("No. Transaksi : " + buatNomorTransaksi());
        System.out.println("Waktu         : " + waktuTransaksi.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.println("===================================");
        System.out.println("Nama Barang   : " + produk.Getnama_prod());
        System.out.println("Harga Satuan  : Rp. " + produk.Getharga_prod());
        System.out.println("Jumlah Beli   : " + jumlahBeli);
        System.out.println("-----------------------------------");
        System.out.println("Total Bayar   : Rp. " + hitungTotal());
        System.out.println("===================================");
        System.out.println("Sisa Stok     : " + produk.Getstok_prod());
        System.out.println("===================================");
    }
}
