package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.absracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.business.absracts.TechnologyService;
import kodlama.io.kodlama.io.Devs.business.request.CreateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.request.DeleteTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.request.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.response.GetAllTechnologyResponse;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyRepository technologyRepository;
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, ProgrammingLanguageService programmingLanguageService) {
		this.technologyRepository = technologyRepository;
		this.programmingLanguageService = programmingLanguageService;
	}
	private boolean isIdExist(int id) {
		for(GetAllTechnologyResponse getAllTechnologyResponse : getAll()) {
			if(getAllTechnologyResponse.getTechnologyId() == id) {
				return true;
			}
		}
		return false;
	}
	private boolean isNameExist(Technology technology) {
		for(GetAllTechnologyResponse getAllTechnologyResponse : getAll()) {
			if(getAllTechnologyResponse.getTechnologyName() == technology.getTechnologyName()) {
				return true;
			}
		}
		return false;
	}
	private void nameCheck(Technology technology) throws Exception {
		if(technology.getTechnologyName().isEmpty()) {
			throw new Exception("Name cannot be empty!");
		}
		if(isNameExist(technology)) {
			throw new Exception("Name cannot be the same!");
		}
	}
	@Override
	public List<GetAllTechnologyResponse> getAll() {
		
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponse> getAllTechnologyResponses = new ArrayList<GetAllTechnologyResponse>();
		for(Technology technology : technologies) {
			GetAllTechnologyResponse responseItem = new GetAllTechnologyResponse();
			responseItem.setTechnologyId(technology.getTechnologyId());
			responseItem.setTechnologyName(technology.getTechnologyName());
			responseItem.setProgrammingLanguageId(technology.getProgrammingLanguage().getProgrammingLanguageId());
			responseItem.setProgrammingLanguageName(technology.getProgrammingLanguage().getProgrammingLanguageName());
			getAllTechnologyResponses.add(responseItem);
		}
		return getAllTechnologyResponses;
	}
	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		
		Technology technology = new Technology();
		ProgrammingLanguage programmingLanguage = programmingLanguageService.getById(createTechnologyRequest.getProgrammingLanguageId());
		technology.setTechnologyName(createTechnologyRequest.getTechnologyName());
		technology.setProgrammingLanguage(programmingLanguage);
		
		nameCheck(technology);
		technologyRepository.save(technology);
	}
	@Override
	public void remove(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
		int id = deleteTechnologyRequest.getTechnologyId();
		if(!isIdExist(id)) {
			throw new Exception("There is no such id!");
		}
		technologyRepository.deleteById(id);
	}
	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		Technology technology =  new Technology();
		ProgrammingLanguage updateProgrammingLanguage = programmingLanguageService.getById(updateTechnologyRequest.getProgrammingLanguageId());
		technology.setTechnologyId(updateTechnologyRequest.getTechnologyId());
		technology.setTechnologyName(updateTechnologyRequest.getTechnologyName());
		technology.setProgrammingLanguage(updateProgrammingLanguage);
		
		nameCheck(technology);
		if(isIdExist(technology.getTechnologyId())) {
			throw new Exception("There is no such id!"); 
		}
		technologyRepository.save(technology);
	}
}