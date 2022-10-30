package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService programmingLanguageService;

	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
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
	@GetMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguageService.add(programmingLanguage);
	}
	@GetMapping("/remove")
	public void remove(int id) throws Exception {
		programmingLanguageService.remove(id);
	}
	@GetMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguageService.update(programmingLanguage);
	}
}
