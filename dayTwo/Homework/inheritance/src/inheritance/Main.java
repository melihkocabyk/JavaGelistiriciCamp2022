package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		
		customer.id = 1;
		customer.firstName = "Melih";
		customer.lastName = "Kocabiyik";
		customer.age = 21;
		customer.email = "melihkocabiyik78523@gmail.com";
	}
}
