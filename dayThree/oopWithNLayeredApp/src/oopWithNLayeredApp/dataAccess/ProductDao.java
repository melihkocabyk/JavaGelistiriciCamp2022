package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao { // Dao = Data Access Object 

	// Interfaces can only have method signature
	void add(Product product);
}
