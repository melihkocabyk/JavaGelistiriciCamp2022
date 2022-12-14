package Kodlama.io.rentACar.business.abstracts;

import java.util.List;

import Kodlama.io.rentACar.business.requests.CreateBrandRequest;
import Kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {

	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);
}
