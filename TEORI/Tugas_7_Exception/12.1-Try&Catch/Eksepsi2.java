public class Eksepsi2 {
    public static void main(String[] args) {
        int pembilang = 5;
        int penyebut = 0;
        try {
            int hasil = pembilang/penyebut;
            System.out.println("hasil = "+ hasil);
        } 
        catch (ArithmeticException x) {
            System.out.println("error: pembagian dengan nol");
        }
    }
}