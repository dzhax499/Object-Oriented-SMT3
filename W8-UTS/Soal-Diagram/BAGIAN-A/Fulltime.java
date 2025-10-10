
abstract class Fulltime extends Employee implements Koperasi {

    double salary;

    public Fulltime(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public void loanMonthly() {
        // Implementasi metode dari interface Koperasi
        System.out.println(name + " is getting a loan from the cooperative.");
    }

    public void displayFulltimeInfo() {
        displayInfo();
        System.out.println("Salary: " + salary);
    }
}
