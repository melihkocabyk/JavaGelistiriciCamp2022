package kodlama.io.rentACarDemo.business.abstracts;

import java.util.List;

import kodlama.io.rentACarDemo.business.requests.CreateBrandRequest;
import kodlama.io.rentACarDemo.business.responses.GetAllBrandsResponse;

public interface BrandService {

	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest) throws Exception;
	void remove(int id);
	void update(GetAllBrandsResponse getAllBrandsResponse);
}
