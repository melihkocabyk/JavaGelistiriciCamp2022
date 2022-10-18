package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository { // Dal = Data Access Layer

	@Override
	public void add() {
		System.out.println("MySql eklendi.");
	}
}
