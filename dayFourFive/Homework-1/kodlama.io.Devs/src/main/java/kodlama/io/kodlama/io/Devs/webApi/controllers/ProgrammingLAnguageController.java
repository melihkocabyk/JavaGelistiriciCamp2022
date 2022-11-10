package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.absracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.request.DeleteProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.kodlama.io.Devs.business.response.GetAllProgrammingLanguageResponse;
import kodlama.io.kodlama.io.Devs.business.response.GetProgrammingLanguageByIdResponse;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLAnguageController {

	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLAnguageController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	@GetMapping("/getall")
	public List<GetAllProgrammingLanguageResponse> getAll() {
		
		return programmingLanguageService.getAll();
	}
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(GetProgrammingLanguageByIdResponse getProgrammingLanguageByIdResponse) throws Exception {
		
		return programmingLanguageService.getById(getProgrammingLanguageByIdResponse);
	}
	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		programmingLanguageService.add(createProgrammingLanguageRequest);
	}
	@DeleteMapping("/remove")
	public void revome(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) throws Exception {
		programmingLanguageService.remove(deleteProgrammingLanguageRequest);
	}
	@PutMapping("/update")
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception {
		programmingLanguageService.update(updateProgrammingLanguageRequest);
	}
}