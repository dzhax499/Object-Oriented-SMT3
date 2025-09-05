package id.ac.polban.service;




public class Transaksi {
    private Produk produk;
    private int jumlahBeli;

    public Transaksi(Produk produk,int jumlahBeli){
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
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

    public void cetak_struk(){
        System.out.println("-- STRUK KOPERASI --");
        System.out.println("Nama barang: " + produk.Getnama_prod());
        System.out.println("Harga satuan: " + produk.Getharga_prod());
        System.out.println("Jumlah beli: " + jumlahBeli);
        System.out.println("Total bayar: " + hitungTotal());
        System.out.println("--------------------");
    }
}