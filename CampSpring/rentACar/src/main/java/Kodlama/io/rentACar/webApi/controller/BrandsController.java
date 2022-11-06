package Kodlama.io.rentACar.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.rentACar.business.abstracts.BrandService;
import Kodlama.io.rentACar.business.requests.CreateBrandRequest;
import Kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

@RestController // annotation
@RequestMapping("/api/brands")
public class BrandsController {
	
	private BrandService brandService;
	
	@Autowired
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll() {
		
		return brandService.getAll();
	}
	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) {
		
		this.brandService.add(createBrandRequest);
	}
}
