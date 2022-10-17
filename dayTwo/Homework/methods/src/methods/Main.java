package methods;

public class Main {

	public static void main(String[] args) {
		
		// function calling
		sayiBulmaca();
	}
	// function creating (function are written in camelCase)
	public static void sayiBulmaca() {
		int[] sayilar = {1, 2, 5, 7, 9, 0};
		int aranacak = 6;
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			mesajVer("sayi mevcuttur: " + aranacak);
		} else {
			mesajVer("sayi mevcut degildir: " + aranacak);
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
