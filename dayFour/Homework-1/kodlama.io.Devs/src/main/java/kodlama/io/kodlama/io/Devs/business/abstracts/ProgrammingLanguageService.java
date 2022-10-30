package kodlama.io.kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id) throws Exception;
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void remove(int id) throws Exception;
	void update(ProgrammingLanguage programmingLanguage) throws Exception;
}
