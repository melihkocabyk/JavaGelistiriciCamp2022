package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.abstracts.SubTechnologyService;
import kodlama.io.kodlama.io.Devs.entities.concretes.SubTechnology;

@RestController
@RequestMapping("/api/subTechnologies")
public class SubTechnologyController {

	private SubTechnologyService subTechnologyService;

	public SubTechnologyController(SubTechnologyService subTechnologyService) {
		this.subTechnologyService = subTechnologyService;
	}
	@GetMapping("/getall")
	public List<SubTechnology> getAll() {
		
		return subTechnologyService.getAll();
	}
	@GetMapping("/getbyid")
	public SubTechnology getById(int id) {
		
		return subTechnologyService.getById(id);
	}
	@PostMapping("/add")
	public void add(SubTechnology subTechnology) {
		subTechnologyService.add(subTechnology);
	}
	@DeleteMapping("/remove")
	public void remove(int id) {
		subTechnologyService.remove(id);
	}
	@PutMapping("/update")
	public void update(SubTechnology subTechnology) {
		subTechnologyService.update(subTechnology);
	}
}
