package oop;

// classes are written in PascalCase
public class Product {

	// fields are written in camelCase
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;
	
	//* encapsulation in Java
	// create Getter
	public String getName() {
		return name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	// create Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
}