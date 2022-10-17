package classesWithAttribute;

public class Product {

	// attribute | field
	private int id; 
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;
	
	// constructor
	public Product() {
		System.out.println("Yapici blok calisti");
	}
	public Product(int id, String name, String description, double price, int stockAmount) {
		System.out.println("Yapici blok calisti.");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
	}
	// getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		// this = means id in this class
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getKod() {
		return this.name.substring(0, 1) + id;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
}
