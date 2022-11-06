package kodlama.io.rentACarDemo.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACarDemo.business.abstracts.BrandService;
import kodlama.io.rentACarDemo.business.requests.CreateBrandRequest;
import kodlama.io.rentACarDemo.business.responses.GetAllBrandsResponse;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

	private BrandService brandService;

	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll() {
		
		return brandService.getAll();
	}
	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) throws Exception {
		
		this.brandService.add(createBrandRequest);
	}
	@DeleteMapping("/remove")
	public void remove(int id) {
		this.brandService.remove(id);
	}
	@PutMapping("/update")
	public void update(GetAllBrandsResponse getAllBrandsResponse) {
		this.brandService.update(getAllBrandsResponse);
	}
}
