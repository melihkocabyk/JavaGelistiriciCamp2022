package kodlama.io.kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammimgLaguageRepository {

	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	void add(ProgrammingLanguage programmingLanguage);
	void remove(int id);
	void update(ProgrammingLanguage programmingLanguage);
}
