package mukemmelSayiRecapDemo;

public class Main {

	public static void main(String[] args) {
		
		// Mukemmel sayi = Kendinden baska pozitif tam bolenlerinin sayisinin toplami kendisine esit olan sayilara mukemmel sayi denir.
		
		int number = 6;
		int toplam = 0;
		
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				toplam += i;
			}
		}
		if(toplam == number) {
			System.out.println("Sayi Mukemmel sayidir.");
		} else {
			System.out.println("Sayi mukemmel sayi degildir.");
		}

	}
}
