package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguageController {

	private ProgrammingLanguageService programmingLanguageService;

	public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguageService.getAll();
	}
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id) throws Exception {
		
		return programmingLanguageService.getById(id);
	}
	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguageService.add(programmingLanguage);
	}
	@DeleteMapping("/remove")
	public void remove(int id) throws Exception {
		programmingLanguageService.remove(id);
	}
	@PutMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguageService.update(programmingLanguage);
	}
}
