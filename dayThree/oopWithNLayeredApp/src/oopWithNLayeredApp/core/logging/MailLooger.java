package oopWithNLayeredApp.core.logging;

public class MailLooger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Mail gonderildi: " + data);
	}
}
