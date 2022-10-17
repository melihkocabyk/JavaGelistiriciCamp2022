package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		
		// Variables are written with camelCase in Java 
		String ortaMetin = "Ilginizi cekebilir.";
		String altMetin = "Vade suresi";
		System.out.println(ortaMetin);
		
		int vade = 12;
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false;
		String okYonu = "";
		
		if(dolarBugun < dolarDun) {
			
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun == dolarDun) {
			
			okYonu = "equal.svg";
			System.out.println(okYonu);
		} else {
			
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		// Arrays
		String[] krediler = {"Hizli kredi", "Ogrenci kredisi"};
		System.out.println(krediler[0]);
		
		for(int i=0; i<krediler.length; i++) {
			
			System.out.println(krediler[i]);
		}
		
	}
}
