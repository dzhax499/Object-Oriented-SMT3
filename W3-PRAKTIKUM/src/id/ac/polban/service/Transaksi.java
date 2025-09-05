package id.ac.polban.service;

import id.ac.polban.model.Produk;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Transaksi {
    private Produk produk;
    private int jumlahBeli;
    private String NoTransaksi;
    private LocalDateTime waktuTransaksi;

    // static variable
    private static int counterTransaksi = 1;
    
    //static method
    public static String generateNoTransaksi(){
        return String.format("TRX-%04d", counterTransaksi++ );
    }
    public Transaksi(Produk produk,int jumlahBeli){
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
        this.NoTransaksi = generateNoTransaksi();
        this.waktuTransaksi = LocalDateTime.now();
    }

    public Produk getProd(){
        return produk;
    }

    public int GetjumlahBeli(){
        return jumlahBeli;
    }

    public int hitungTotal() {
        return produk.Getharga_prod() * jumlahBeli;
    }

    //static getter
    public String GetnoTransaksi(){
        return NoTransaksi;
    }
    // 
    public boolean ProsesTransaksi(){
        return produk.kurangiStok(jumlahBeli);
    }
    public void cetakStruk() {
        System.out.println("========== STRUK KOPERASI ==========");
        System.out.println("No. Transaksi : " + NoTransaksi);
        System.out.println("Waktu         : " + waktuTransaksi.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        System.out.println("===================================");
        System.out.println("Nama Barang   : " + produk.Getnama_prod());
        System.out.println("ID Produk     : " + produk.Getid_prod());
        System.out.println("Harga Satuan  : Rp. " + produk.Getharga_prod());
        System.out.println("Jumlah Beli   : " + jumlahBeli);
        System.out.println("-----------------------------------");
        System.out.println("Total Bayar   : Rp. " + hitungTotal());
        System.out.println("===================================");
        System.out.println("Sisa Stok     : " + produk.Getstok_prod());
        System.out.println("===================================");
    }
}