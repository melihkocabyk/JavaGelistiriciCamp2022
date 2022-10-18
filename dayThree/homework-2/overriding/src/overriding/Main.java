package overriding;

public class Main {

	public static void main(String[] args) {
		
		BaseKrediManager[] baseKrediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
		for(BaseKrediManager kredimanagers : baseKrediManagers) {
			System.out.println(kredimanagers.hesapla(1000));
		}
	}
}
