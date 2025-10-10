
public class Employee {

    String name;
    int id;
    Department department; // Agregasi has-a 

    public Employee(String name, int id, Department department) {
        this.name = name;
        this.id = id;
        this.department = department; // Employee memiliki Department
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Department: " + department.getDepartmentName());
    }
}
