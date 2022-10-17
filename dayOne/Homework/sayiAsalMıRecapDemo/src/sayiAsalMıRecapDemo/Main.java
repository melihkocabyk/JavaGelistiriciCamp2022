package sayiAsalMıRecapDemo;

public class Main {

	public static void main(String[] args) {
		
		int number = 1;
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Asal sayi degildir.");
			return;
		}
		if(number < 1) {
			System.out.println("Gecersiz sayidir.");
		}
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("Sayi asal sayidir.");
		} else {
			System.out.println("Sayi asal sayi degildir.");
		}

	}
}
