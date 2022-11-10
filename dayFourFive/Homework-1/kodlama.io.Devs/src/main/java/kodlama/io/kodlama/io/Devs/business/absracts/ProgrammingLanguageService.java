package kodlama.io.kodlama.io.Devs.business.absracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.request.DeleteProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.response.GetAllProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.response.GetProgrammingLanguageByIdResponse;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	List<GetAllProgrammingLanguageResponse> getAll();
	ProgrammingLanguage getById(GetProgrammingLanguageByIdResponse getProgrammingLanguageByIdResponse) throws Exception;
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
	void remove(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception;
	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception;
}