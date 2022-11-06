package kodlama.io.rentACarDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import javax.el.ELException;

import org.springframework.stereotype.Service;

import kodlama.io.rentACarDemo.business.abstracts.BrandService;
import kodlama.io.rentACarDemo.business.requests.CreateBrandRequest;
import kodlama.io.rentACarDemo.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACarDemo.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACarDemo.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<GetAllBrandsResponse> getAll() {
		
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponses = new ArrayList<GetAllBrandsResponse>();
		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			responseItem.setPrice(brand.getPrice());
			brandsResponses.add(responseItem);
		}
		return brandsResponses;
	}
	@Override
	public void add(CreateBrandRequest createBrandRequest) throws Exception {
		if(createBrandRequest.getName().isEmpty()) {
			throw new Exception("isim boş");
		} 
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		brand.setPrice(createBrandRequest.getPrice());
		
		
		this.brandRepository.save(brand);
	}
	@Override
	public void remove(int id) {
		
		this.brandRepository.deleteById(id);
	}
	@Override
	public void update(GetAllBrandsResponse getAllBrandsResponse) {
		Brand brand = new Brand();
		brand.setId(getAllBrandsResponse.getId());
		brand.setName(getAllBrandsResponse.getName());
		brand.setPrice(getAllBrandsResponse.getPrice());
		this.brandRepository.save(brand);
		
	}
}
