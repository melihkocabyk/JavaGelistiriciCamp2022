package kodlama.io.kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguage {

	private int id;
	private String name;
	
	// constructor
	public ProgrammingLanguage() {

	}
	public ProgrammingLanguage(int id, String name) {
		this.id = id;
		this.name = name;
	}
	// getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
