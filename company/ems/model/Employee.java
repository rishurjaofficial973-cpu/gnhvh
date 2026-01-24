package company.ems.model;

public class Employee extends Person {

    private String department;
    private double salary;

    public Employee(int id, String name, String email,
                    String department, double salary) {

        super(id, name, email); // parent constructor
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeInfo() {
        displayPersonInfo();
        System.out.println("Department : " + department);
        System.out.println("Salary     : " + salary);
    }
}