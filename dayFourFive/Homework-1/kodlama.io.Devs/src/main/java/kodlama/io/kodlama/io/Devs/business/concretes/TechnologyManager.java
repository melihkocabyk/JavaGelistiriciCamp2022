package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.absracts.TechnologyService;
import kodlama.io.kodlama.io.Devs.business.request.CreateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.request.DeleteTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.request.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.response.GetAllTechnologyResponse;
import kodlama.io.kodlama.io.Devs.business.response.GetTechnologyByIdResponse;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyRepository technologyRepository;

	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository) {
		this.technologyRepository = technologyRepository;
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
			getAllTechnologyResponses.add(responseItem);
		}
		return getAllTechnologyResponses;
	}
	@Override
	public Technology getById(GetTechnologyByIdResponse getTechnologyByIdResponse) throws Exception {
		int id = getTechnologyByIdResponse.getTechnologyId();
		if(!isIdExist(id)) {
			throw new Exception("There is no such id!");
		}
		return technologyRepository.findById(id).get();
	}
	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		
		Technology technology = new Technology();
		technology.setTechnologyName(createTechnologyRequest.getTechnologyName());
		
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
		technology.setTechnologyId(updateTechnologyRequest.getTechnologyId());
		technology.setTechnologyName(updateTechnologyRequest.getTechnologyName());
		
		nameCheck(technology);
		if(isIdExist(technology.getTechnologyId())) {
			throw new Exception("There is no such id!"); 
		}
		technologyRepository.save(technology);
	}
}