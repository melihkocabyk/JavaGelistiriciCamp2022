package kodlama.io.kodlama.io.Devs.business.absracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.business.request.CreateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.request.DeleteTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.request.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.response.GetAllTechnologyResponse;
import kodlama.io.kodlama.io.Devs.business.response.GetTechnologyByIdResponse;
import kodlama.io.kodlama.io.Devs.entities.concretes.Technology;

public interface TechnologyService {

	List<GetAllTechnologyResponse> getAll();
	Technology getById(GetTechnologyByIdResponse getTechnologyByIdResponse) throws Exception;
	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
	void remove(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception;
	void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception;
}