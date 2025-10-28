/**
 * Kelas Student yang menyimpan atribut mahasiswa.
 * Menggunakan Generics <T> untuk Department agar bisa
 * menerima String atau Integer.
 * * Mengimplementasikan Comparable untuk mengizinkan
 * pengurutan berdasarkan Nama.
 */
public class Student<T> implements Comparable<Student<T>> {

    // Atribut
    private String studentID;
    private String name;
    private String address;
    private T department; // Atribut generik

    // Konstruktor
    public Student(String studentID, String name, String address, T department) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.department = department;
    }

    // Getter
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public T getDepartment() {
        return department;
    }

    @Override
    public int compareTo(Student<T> other) {
        // Menggunakan perbandingan String bawaan
        return this.name.compareTo(other.getName());
    }


    @Override
    public String toString() {
        return "Student [ID=" + studentID +
                ", Name=" + name +
                ", Address=" + address +
                ", Department=" + department + "]";
    }
}