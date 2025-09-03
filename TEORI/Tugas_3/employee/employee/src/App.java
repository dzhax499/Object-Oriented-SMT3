import id.ac.polban.employee.model.Department;
import id.ac.polban.employee.model.Employee;
import id.ac.polban.employee.model.EmploymentType;
import id.ac.polban.employee.service.EmployeeService;

public class App {
    public static void main(String[] args)  {
        
        EmployeeService service = new EmployeeService();
        
        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");

        EmploymentType fullTime = new EmploymentType("FULL_TIME");
        EmploymentType contract = new EmploymentType("CONTRACT");

        Employee emp1 = new Employee(1, "Budi", itDept, fullTime, 7000000);
        Employee emp2 = new Employee(2, "Ani", hrDept, contract, 5000000);

        service.addEmployee(emp1);
        service.addEmployee(emp2);
        System.out.println("Data sebelum kenaikan: " + service.getEmployee(1).getSalary());
        service.raiseSalary(1, 10);
        System.out.println("Data setelah kenaikan: " + service.getEmployee(1).getSalary());
        
    }
}
