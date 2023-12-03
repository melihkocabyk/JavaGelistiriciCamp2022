package oop;

public class Main {

	public static void main(String[] args) {
		
		// Objects are defined like this 
		Product product1 = new Product();
		product1.setName("Delongi kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2.jpg");
				
		Product product3 = new Product();
		product3.setName("Kitchen Aid kahve Makinesi");
		product3.setDiscount(4);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(6);
		product3.setImageUrl("image3.jpg");
				
		Product[] products = {product1, product2, product3};
		for(Product product : products) {
			System.out.println(product.getName());
		}
				
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05074425150");
		individualCustomer.setCustomerNumber("59262");
		individualCustomer.setFirstName("Melih");
		individualCustomer.setLastName("Kocabıyık");
				
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(1);
		corporateCustomer.setPhone("05324612573");
		corporateCustomer.setCustomerNumber("89426");
		corporateCustomer.setCompanyName("Kocabıyık Lojistik");
		corporateCustomer.setTaxNumber("99467248");
				
		Customer[] customers = {individualCustomer, corporateCustomer};
		for(Customer customer : customers) {
			System.out.println(customer.getCustomerNumber());
		}
	}
}