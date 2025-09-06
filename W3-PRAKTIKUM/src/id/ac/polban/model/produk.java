package id.ac.polban.model;

public class Produk {

    private String nama_prod;
    private int harga_prod;
    private int stok_prod;

    //static 
    private static int totalProduk = 0;

    public Produk(String nama_prod, int harga_prod, int stok_prod) {
        this.nama_prod = nama_prod;
        this.harga_prod = harga_prod;
        this.stok_prod = stok_prod;
        totalProduk++;
    }
//GETTER
   public String Getnama_prod() {
        return nama_prod;
    }

   public int Getharga_prod() {
        return harga_prod;
    }

   public int Getstok_prod() {
        return stok_prod;
    }


   // STATIC METHOD
    //getter static
   public static int GetTotalProduk() {
        return totalProduk;
    }
    
//SETTER
   public void setStok_prod(){
      this.stok_prod = stok_prod;
   }

// METHOD

   // untuk mengurangi stok (method))
    public boolean kurangi_prod(int jumlah){
      if (stok_prod >= jumlah){
         stok_prod = stok_prod - jumlah;
         return true;
      }
      return false;
    }

   @Override
    public String toString() {
        return nama_prod + " - Rp" + harga_prod + " (Stok: " + stok_prod + ")";
    }
}
