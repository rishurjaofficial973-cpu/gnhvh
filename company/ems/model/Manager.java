package company.ems.model;

public class Manager extends Employee {

    private double bonus;

    public Manager(int id, String name, String email,
                   String department, double salary,
                   double bonus) {

        super(id, name, email, department, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void displayManagerInfo() {
        displayEmployeeInfo();
        System.out.println("Bonus      : " + bonus);
    }
}