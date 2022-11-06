package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	private boolean isIdExist(int id) {
		for(ProgrammingLanguage programmingLanguage : getAll()) {
			if(programmingLanguage.getId() == id) {
				return true;
			}
		}
		return false;
	}
	private boolean isNameExist(ProgrammingLanguage programmingLanguage) {
		for(ProgrammingLanguage language : getAll()) {
			if(language.getName() == programmingLanguage.getName()) {
				return true;
			}
		}
		return false;
	}
	private void nameCheck(ProgrammingLanguage programmingLanguage) throws Exception {
		if(programmingLanguage.getName().isEmpty()) {
			throw new Exception("Name cannot be empty!");
		}
		if(isNameExist(programmingLanguage)) {
			throw new Exception("Name cannot be the same!");
		}
	}
	@Override
	public List<ProgrammingLanguage> getAll() {

		return programmingLanguageRepository.findAll();
	}
	@Override
	public ProgrammingLanguage getById(int id) throws Exception {
		if(!isIdExist(id)) {
			throw new Exception("There is no such id!");
		}
		return programmingLanguageRepository.findById(id).get();
	}
	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		nameCheck(programmingLanguage);
		programmingLanguageRepository.save(programmingLanguage);
	}
	@Override
	public void remove(int id) throws Exception {
		if(!isIdExist(id)) {
			throw new Exception("There is no such id!");
		}
		programmingLanguageRepository.existsById(id);
	}
	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		nameCheck(programmingLanguage);
		if(!isIdExist(programmingLanguage.getId())) {
			throw new Exception("There is no such id!");
		}
		programmingLanguageRepository.save(programmingLanguage);
	}
}
