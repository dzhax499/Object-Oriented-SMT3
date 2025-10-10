
abstract class Employee {

    private String name;
    private String position;
    private Department department; // Agregasi has-a
    protected int baseSalary;

    public Employee(String name, String position, Department departemen) {
        this.name = name;
        this.position = position;
        this.department = department; // Employee memiliki Department
        setBaseSalary();
    }

    private void setBaseSalary() {
        switch (position.toLowerCase()) {
            case "manager":
                baseSalary = 5000000;
                break;
            case "programmer":
                baseSalary = 3000000;
                break;
            case "analis":
                baseSalary = 3000000;
                break;
            default:
                baseSalary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Department getDepartemen() {
        return department;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public abstract int getSalary();
}
