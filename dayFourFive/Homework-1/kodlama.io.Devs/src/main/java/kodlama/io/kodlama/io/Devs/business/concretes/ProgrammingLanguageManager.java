package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.absracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.request.DeleteProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.response.GetAllProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.response.GetProgrammingLanguageByIdResponse;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	private boolean isIdExist(int id) {
		for(GetAllProgrammingLanguageResponse getAllProgrammingLanguageResponse : getAll()) {
			if(getAllProgrammingLanguageResponse.getProgrammingLanguageId() == id) {
				return true;
			}
		}
		return false;
	}
	private boolean isNameExist(ProgrammingLanguage programmingLanguage) {
		for(GetAllProgrammingLanguageResponse getAllProgrammingLanguageResponse : getAll()) {
			if(getAllProgrammingLanguageResponse.getProgrammingLanguageName() == programmingLanguage.getProgrammingLanguageName()) {
				return true;
			}
		}
		return false;
	}
	private void nameCheck(ProgrammingLanguage programmingLanguage) throws Exception {
		if(programmingLanguage.getProgrammingLanguageName().isEmpty()) {
			throw new Exception("Name cannot be empty!");
		}
		if(isNameExist(programmingLanguage)) {
			throw new Exception("Name cannot be the same!");
		}
	}
	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> getAllProgrammingLanguageResponses = new ArrayList<GetAllProgrammingLanguageResponse>();
		for(ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguageResponse responseItem = new GetAllProgrammingLanguageResponse();
			responseItem.setProgrammingLanguageId(programmingLanguage.getProgrammingLanguageId());
			responseItem.setProgrammingLanguageName(programmingLanguage.getProgrammingLanguageName());
			getAllProgrammingLanguageResponses.add(responseItem);
		}
		return getAllProgrammingLanguageResponses;
	}
	@Override
	public ProgrammingLanguage getById(GetProgrammingLanguageByIdResponse getProgrammingLanguageByIdResponse) throws Exception {
		int id = getProgrammingLanguageByIdResponse.getProgrammingLanguageId();
		if(!isIdExist(id)) {
			throw new Exception("There is no such id!");
		}
		return programmingLanguageRepository.findById(id);
	}
	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setProgrammingLanguageName(createProgrammingLanguageRequest.getProgrammingLanguageName());
		
		nameCheck(programmingLanguage);
		programmingLanguageRepository.save(programmingLanguage);
	}
	@Override
	public void remove(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception {
		int id = deleteProgrammingLanguageRequest.getProgrammingLanguageId();
		if(!isIdExist(id)) {
			throw new Exception("There is no such id!");
		}
		programmingLanguageRepository.deleteById(id);
	}
	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setProgrammingLanguageId(updateProgrammingLanguageRequest.getProgrammingLanguageId());
		programmingLanguage.setProgrammingLanguageName(updateProgrammingLanguageRequest.getProgrammingLanguageName());
		
		nameCheck(programmingLanguage);
		if(!isIdExist(programmingLanguage.getProgrammingLanguageId())) {
			throw new Exception("There is no such id!");
		}
		programmingLanguageRepository.save(programmingLanguage);
	}
	@Override
	public ProgrammingLanguage getById(int id) {
		
		ProgrammingLanguage programmingLanguages = programmingLanguageRepository.findById(id); 
		ProgrammingLanguage getAllProgrammingLanguageResponse = new ProgrammingLanguage();
		getAllProgrammingLanguageResponse.setProgrammingLanguageId(programmingLanguages.getProgrammingLanguageId());
		getAllProgrammingLanguageResponse.setProgrammingLanguageName(programmingLanguages.getProgrammingLanguageName());
		return getAllProgrammingLanguageResponse;
	}
}