package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.absracts.TechnologyService;
import kodlama.io.kodlama.io.Devs.business.request.CreateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.request.DeleteTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.request.UpdateTechnologyRequest;
import kodlama.io.kodlama.io.Devs.business.response.GetAllTechnologyResponse;
import kodlama.io.kodlama.io.Devs.business.response.GetTechnologyByIdResponse;
import kodlama.io.kodlama.io.Devs.entities.concretes.Technology;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {

	private TechnologyService technologyService;

	@Autowired
	public TechnologyController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}
	@GetMapping("/getall")
	public List<GetAllTechnologyResponse> getAll() {
		
		return technologyService.getAll();
	}
	@GetMapping("/getbyid")
	public Technology getById(GetTechnologyByIdResponse getTechnologyByIdResponse) throws Exception {
		
		return technologyService.getById(getTechnologyByIdResponse);
	}
	@PostMapping("/add")
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		technologyService.add(createTechnologyRequest);
	}
	@DeleteMapping("/remove")
	public void remove(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
		technologyService.remove(deleteTechnologyRequest);
	}
	@PutMapping("/update")
	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		technologyService.update(updateTechnologyRequest);
	}
}