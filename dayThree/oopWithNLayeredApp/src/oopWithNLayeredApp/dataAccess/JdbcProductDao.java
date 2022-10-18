package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		// Only database access codes are written here (SQL)
		System.out.println("JDBC ile veritabanına eklendi.");
	}
}
