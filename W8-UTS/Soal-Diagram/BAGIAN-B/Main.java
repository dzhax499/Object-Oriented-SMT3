public class Main {

    public static void main(String[] args) {
        Department itDept = new Department("IT");

        // Data Asep (Fulltime Programmer)
        Koperasi koperasiAsep = new Koperasi(500000);
        Fulltime asep = new Fulltime(
                "Asep", "Programmer", itDept,
                2, // anak
                3, // lembur jam (09:00-12:00)
                koperasiAsep
        );

        // Data Ujang (Parttime Programmer)
        Parttime ujang = new Parttime(
                "Ujang", "Programmer", itDept,
                5 // lembur jam (13:00-18:00)
        );

        System.out.println("Gaji bulan April 2025:");
        System.out.println("Asep (Fulltime): Rp " + asep.getSalary());
        System.out.println("Ujang (Parttime): Rp " + ujang.getSalary());
    }
}
