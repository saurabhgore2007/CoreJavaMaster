package Day25.SingleResponsibilityDemo;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee(1, "Saurabh", 50000);
		
		SalaryService salaryService = new SalaryService();
		
		EmployeeRepository repository = new EmployeeRepository();

	    EmailService emailService = new EmailService();

	    ReportService reportService = new ReportService();
	    
	    salaryService.calculateSalary(emp);

        repository.save(emp);

        emailService.sendEmail(emp);

        reportService.generateReport(emp);
	}

}
