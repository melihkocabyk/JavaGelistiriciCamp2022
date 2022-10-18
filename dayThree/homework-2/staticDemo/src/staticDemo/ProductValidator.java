package staticDemo;

public class ProductValidator {

	// ststic fonction
	static {
		System.out.println("Static yapici blok calisti.");
	}
	// constructor
	public ProductValidator() {
		System.out.println("Yapici blok calisti.");
	}
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	public void birsey() {
		
	}
}
