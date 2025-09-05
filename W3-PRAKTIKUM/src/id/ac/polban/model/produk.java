package id.ac.polban.model;

public class Produk {

    private String nama_prod;
    private int harga_prod;
    private int stok_prod;
    private int jumlah_prod;

    //static 
    private static int totalProduk = 0;
    private static int nextId = 1;
    private int id_prod;

    public Produk(String nama_prod, int harga_prod, int stok_prod, int jumlah_prod, int totalProduk, int nextId, int id_prod) {
        this.nama_prod = nama_prod;
        this.harga_prod = harga_prod;
        this.stok_prod = stok_prod;
        this.jumlah_prod = jumlah_prod;
        this.totalProduk = totalProduk;
        this.nextId = nextId;
        this.id_prod = id_prod;
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

   public int Getjumlah_prod() {
        return jumlah_prod;
    }

   // STATIC METHOD
    //getter static
   public static int GetTotalProduk() {
        return totalProduk;
    }
    
   public int GetnextId(){
      return nextId;
   }

   public int Getid_prod(){
      return id_prod;
   }

//SETTER
   public void setStok_prod(){
      this.stok_prod = stok_prod;
   }
   public void setJumlah_prod(){
      this.jumlah_prod = jumlah_prod;
   }

// METHOD
   // static methode untuk reset jumlah
    public static void resetCounter() {
      nextId = 1;
      totalProduk = 0;
    }

   // untuk mengurangi stok (method))
    public boolean kurangiStok(int jumlah){
      if (stok_prod >= jumlah){
         stok_prod -= jumlah;
         return true;
      }
      return false;
    }

    @Override
    public String toString(){
      return "ID: " + id_prod + " | " + nama_prod + " - Rp." + harga_prod + " (Stok: " + stok_prod + ")";
    }
}
