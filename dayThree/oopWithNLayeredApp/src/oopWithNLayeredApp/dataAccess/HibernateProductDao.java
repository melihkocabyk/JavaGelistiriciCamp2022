package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		// Only database access codes are written here (SQL)
		System.out.println("Hibernate ile veritabanına eklendi.");
	}
}
