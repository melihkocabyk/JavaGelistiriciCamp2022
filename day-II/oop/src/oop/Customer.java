package oop;

public class Customer {

	private int id;
	private String customerNumber;
	private String phone;
	
	// Getter
	public int getId() {
		return id;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public String getPhone() {
		return phone;
	}
	// Setter
	public void setId(int id) {
		this.id = id;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}