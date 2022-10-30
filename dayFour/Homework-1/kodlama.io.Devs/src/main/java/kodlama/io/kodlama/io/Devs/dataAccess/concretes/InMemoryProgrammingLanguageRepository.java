package kodlama.io.kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammimgLaguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammimgLaguageRepository{

	List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
		programmingLanguages.add(new ProgrammingLanguage(4, "C++"));
		programmingLanguages.add(new ProgrammingLanguage(5, "JavaScript"));
	}
	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguages;
	}
	@Override
	public ProgrammingLanguage getById(int id) {
		for(ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if(programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		return null;
	}
	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
	}
	@Override
	public void remove(int id) {
		programmingLanguages.remove(getById(id));
	}
	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		ProgrammingLanguage language = getById(programmingLanguage.getId());
		if(programmingLanguage.getId() == language.getId()) {
			language.setName(programmingLanguage.getName());
		}
	}
}
