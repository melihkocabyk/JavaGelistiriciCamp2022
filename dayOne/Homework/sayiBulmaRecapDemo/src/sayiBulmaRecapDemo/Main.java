package sayiBulmaRecapDemo;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = {1, 2, 5, 7, 9, 0};
		int aranacak = 8;
		boolean sayiVarMi = false;
		
		for(int aranan : sayilar) {
			if(aranacak == aranan) {
				sayiVarMi = true;
				break;
			}
		}
		if(sayiVarMi) {
			System.out.println("Sayi Vardir.");
		} else {
			System.out.println("Sayi yoktur.");
		}
		
	}
}
