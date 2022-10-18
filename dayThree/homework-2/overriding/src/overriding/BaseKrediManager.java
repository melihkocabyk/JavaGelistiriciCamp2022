package overriding;

public class BaseKrediManager {

	// If we don't want it to be overwritten we can use the 'final' keyword 
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
