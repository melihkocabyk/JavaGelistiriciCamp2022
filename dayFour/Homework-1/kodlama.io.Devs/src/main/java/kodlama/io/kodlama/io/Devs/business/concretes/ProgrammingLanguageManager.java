package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammimgLaguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammimgLaguageRepository programmimgLaguageRepository;
	
	public ProgrammingLanguageManager(ProgrammimgLaguageRepository programmimgLaguageRepository) {
		this.programmimgLaguageRepository = programmimgLaguageRepository;
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
	public void nameCheck(ProgrammingLanguage programmingLanguage) throws Exception {
		if(programmingLanguage.getName().isEmpty()) {
			throw new Exception("Name cannot be empty!");
		}
		if(isNameExist(programmingLanguage)) {
			throw new Exception("Name cannot be the same!");
		}
	}
	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmimgLaguageRepository.getAll();
	}
	@Override
	public ProgrammingLanguage getById(int id) throws Exception {
		if(!isIdExist(id)) {
			throw new Exception("There is no such id!");
		}
		return programmimgLaguageRepository.getById(id);
	}
	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		nameCheck(programmingLanguage);
		programmimgLaguageRepository.add(programmingLanguage);
	}
	@Override
	public void remove(int id) throws Exception {
		if(!isIdExist(id)) {
			throw new Exception("There is no such id!");
		}
		programmimgLaguageRepository.remove(id);
	}
	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		nameCheck(programmingLanguage);
		if(!isIdExist(programmingLanguage.getId())) {
			throw new Exception("There is no such id");
		}
		programmimgLaguageRepository.update(programmingLanguage);
	}
}
