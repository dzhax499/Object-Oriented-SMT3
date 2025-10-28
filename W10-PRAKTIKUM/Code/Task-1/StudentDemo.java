import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class StudentDemo {

    public static void main(String[] args) {

        // Tugas 2: ArrayList dan Sorting
        System.out.println(" Bagian 1: ArrayList dan Sorting ");

        // Membuat ArrayList untuk menyimpan objek Student
        // berupa <String> atau <Integer>
        List<Student> studentList = new ArrayList<>();

        // Membuat 5 objek Student dan menambahkannya ke ArrayList
        // Nama sengaja dibuat tidak berurutan
        studentList.add(new Student<String>("241511071", "Dzakir", "Jl. Merdeka", "Teknik Informatika"));
        studentList.add(new Student<Integer>("241511082", "Ibnu", "Jl. Setiabudi", 101)); // Dept. sebagai Integer
        studentList.add(new Student<String>("241511091", "Asep", "Jl. Dago", "Teknik Informatika"));
        studentList.add(new Student<String>("241511088", "Ican", "Jl. Cihampelas", "Teknik Informatika"));
        studentList.add(new Student<Integer>("241511099", "Umem", "Jl. Riau", 102)); // Dept. sebagai Integer

        // Menampilkan list SEBELUM diurutkan
        System.out.println("\n[SEBELUM DIURUTKAN BERDASARKAN NAMA]");
        for (Student<?> student : studentList) {
            System.out.println(student);
        }

        // Mengurutkan ArrayList menggunakan Collections.sort()
        // Ini berhasil karena kelas Student mengimplementasikan Comparable
        Collections.sort(studentList);

        // Menampilkan list SETELAH diurutkan
        System.out.println("\n[SETELAH DIURUTKAN BERDASARKAN NAMA]");
        for (Student<?> student : studentList) {
            System.out.println(student);
        }

        // Tugas 3: Vector dan Filtering
        System.out.println("\n Bagian 2: Vector dan Filtering ");

        // Membuat Vector (mirip dengan ArrayList, tetapi thread-safe)
        Vector<Student<?>> studentVector = new Vector<>();

        // Membuat 5 objek Student dan menambahkannya ke Vector
        studentVector.add(new Student<String>("24151123", "Farah", "Jl. Sudirman", "Teknik Informatika"));
        studentVector.add(new Student<Integer>("24150152", "Gilang", "Jl. Asia Afrika", 201)); // Dept. lain
        studentVector.add(new Student<String>("24159921", "Hana", "Jl. Pasteur", "Teknik Informatika"));
        studentVector.add(new Student<String>("24151120", "Indra", "Jl. Kopo", "Physics")); // Dept. lain
        studentVector.add(new Student<String>("23141991", "Joko", "Jl. Buahbatu", "Teknik Informatika"));

        System.out.println("\n[MAHASISWA DI DEPARTEMEN 'Teknik Informatika']");
        
        for (Student<?> student : studentVector) {
            Object dept = student.getDepartment();

            // Memeriksa apakah tipe datanya String DAN nilainya "Teknik Informatika"
            if (dept instanceof String && ((String) dept).equalsIgnoreCase("Teknik Informatika")) {
                System.out.println(student);
            }
        }
    }
}