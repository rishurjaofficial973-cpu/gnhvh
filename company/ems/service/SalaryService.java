package company.ems.service;

import company.ems.model.Manager;

public class SalaryService {

    public double calculateTotalSalary(Manager manager) {
        return manager.getSalary() + manager.getBonus();
    }
}