package methods;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugun hava cok guzel";
		System.out.println(mesaj);
		
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		
		int sayi = topla(15, 7);
		System.out.println(sayi);
		
		int toplam = topla(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);
	}
	// function that do not return values
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("silindi");
	}
	public static void guncelle() {
		System.out.println("Guncellendi");
	}
	
	// function that return integer values
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	// functions that return string values
	public static String sehirVer() {
		return "Ankara";
	}
	
	// variable arguments
	public static int topla(int... sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
}