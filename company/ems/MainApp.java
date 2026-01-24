package company.ems;
import company.ems.model.Manager ;
import company.ems.service.SalaryService;

public class MainApp {
	public static void main (String[]args) {
		Manager manager = new Manager(
				101,
				"Rahul Sharma",
				"rahul@company.com",
				"IT",
				80000,
				20000
				); 
	manager .displayManagerInfo();
	SalaryService service =new SalaryService();
	double totalSalary = service.calculateTotalSalary(manager);
	System.out.println("Total Salary : " + totalSalary);
			
		
	}
			
			
	

}
