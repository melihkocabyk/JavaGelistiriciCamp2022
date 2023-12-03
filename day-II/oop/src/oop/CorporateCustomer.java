package oop;

//extends keyword is using for inheritance in Java
public class CorporateCustomer extends Customer {

	private String companyName;
	private String taxNumber;
	
	// Getter
	public String getCompanyName() {
		return companyName;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	// Setter
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
}