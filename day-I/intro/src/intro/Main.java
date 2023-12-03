package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		// Variable are written with camelCase in Java
		// Variable definition -> type variableName = value;
		String ortaMetin = "ilginizi cekebilir.";
		String altMetin = "vade suresi";
		System.out.println(ortaMetin);
		
		int vade = 12;
		double dolarBugun = 23.25;
		double dolarDun = 23.22;
		boolean dolarDustuMu = false;
		String okYonu = "";
		// in Java the word "final" is used for immutable (constants) variables
		final double piNumber = 3.14;
		
		if(dolarBugun < dolarDun) {
			
			okYonu = "down.svg";
			System.out.println(okYonu);
			dolarDustuMu = true;
			
		} else if(dolarBugun > dolarDun) {
			
			okYonu = "up.svg";
			System.out.println(okYonu);
			dolarDustuMu = false;
			
		} else {
			
			okYonu = "equal.svg";
			System.out.println(okYonu);
			
		}
		
		// -- Array --
		String[] krediler = {"Hizli kredi", "Ogrenci kredisi"};
		System.out.println(krediler[0]);
		
		for(int i=0; i<krediler.length; i++) {
			
			System.out.println(krediler[i]);

		}
	}
}