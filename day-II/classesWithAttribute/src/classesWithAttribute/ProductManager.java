package classesWithAttribute;

public class ProductManager {

	public void add(Product product) {
		//JDBC
		System.out.println(product.getName() + " Urunu eklendi");
	}
	// not a very correct usage
	public void add(int id, String name, String description, int stockAmount, double price) {
		
	}
}