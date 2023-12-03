package oop;

//extends keyword is using for inheritance in Java
public class IndividualCustomer extends Customer {

	private String firstName;
	private String lastName;
	
	// Getter
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	// Setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}