public class Produk {
 private String nama_prod;
 private int harga_prod;
 private int stok_prod;
 private int jumlah_prod;

 public Produk(String nama_prod, int harga_prod,int stok_prod,int jumlah_prod) {
    this.nama_prod = nama_prod;
    this.harga_prod = harga_prod;
    this.stok_prod = stok_prod;
    this.jumlah_prod = jumlah_prod;
 }
 public String Getnama_prod(){
    return nama_prod;
 }
 public int Getharga_prod(){
    return harga_prod;
 }
 public int Getstok_prod(){
    return stok_prod;
 }
 public int Getjumlah_prod(){
    return jumlah_prod;
 }

}