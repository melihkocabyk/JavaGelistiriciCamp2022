package enBuyukSayiyiBulmaDemo;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 30;
		
		// Baslangicta en buyuk sayiyi sayi1 olarak atiyoruz
		int enBuyukSayi = sayi1; 
		
		if(sayi1 < sayi2) { // sayi1 ile sayi2'yi birbiriyle kiyasliyoruz
			if(sayi2 < sayi3) { // sayi2 ile sayi3'u birbiriyle kiyasliyoruz
				enBuyukSayi = sayi3;
			} else {
				enBuyukSayi = sayi2;
			}
		}
		System.out.println(enBuyukSayi);
	}
}
