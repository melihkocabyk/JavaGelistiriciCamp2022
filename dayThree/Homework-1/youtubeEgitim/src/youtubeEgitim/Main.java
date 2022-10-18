package youtubeEgitim;

public class Main {


	public static void main(String[] args) {
		
		// value type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1); // 20

		// arrays are reference types
		int[] sayilar1 = {1, 2, 3};
		int[] sayilar2 = {10, 20, 30};
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;
		System.out.println(sayilar1[0]); // 1000
		
		
		
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer(); // instance creation
		customer.id = 1;
		customer.city = "Bursa";
		
		CustomerManager customerManager = new CustomerManager(customer, new MilitaryCreditManager());
		customerManager.save();
		customerManager.delete();
		customerManager.giveCredit();
		
		CompanyCustomer companyCustomer = new CompanyCustomer();
		companyCustomer.taxNumber = "7634616";
		companyCustomer.companyName = "Kocabiyik ticaret";
		
		Person person = new Person();
		person.firstName = "Melih";
		person.lastName = "Kocabiyik";
		person.nationalIdentity = "315314363";
		
		
		
	}
}
