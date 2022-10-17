
public class Main {

	public static void main(String[] args) {
		
		double[] myList = {1.2, 1.3, 4.3, 5.6};
		
		// Dizideki elemanlari tek tek yazdirma
		for(double number : myList) {
			System.out.println(number);
		}
		
		// Dizideki elemanlarin toplamini hesaplma
		double toplam = 0.0;
		for(double number : myList) {
			toplam += number;
		}
		System.out.println("Dizi elemanlarinin toplami: " + toplam);
		
		// Dizideki en buyuk sayiyi bulma
		double max = myList[0]; // en buyuk sayi baslangicta 0'inci index olarak ayarliyoruz.
		for(double number : myList) {
			if(max < number) {
				max = number;
			}
		}

	}
}
