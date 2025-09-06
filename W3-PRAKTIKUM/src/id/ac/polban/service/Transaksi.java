package id.ac.polban.service;

import id.ac.polban.model.Produk;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Transaksi {
    private Produk produk;
    private int jumlahBeli;
    private LocalDateTime waktuTransaksi;

    // static variable
    private static int nomorTransaksi = 1; // auto-increment nomor
    
    public Transaksi(Produk produk,int jumlahBeli){
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
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

    //static Method
    public static String buatNomorTransaksi(){
        String nomor = "TRX -" + String.format("%03d", nomorTransaksi);
        nomorTransaksi++;
        return nomor;
    }

    public boolean ProsesTransaksi(){
        return produk.kurangi_prod(jumlahBeli); //depedency
    }

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