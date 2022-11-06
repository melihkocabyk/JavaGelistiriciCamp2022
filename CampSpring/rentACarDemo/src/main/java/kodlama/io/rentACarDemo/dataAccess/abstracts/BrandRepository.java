package kodlama.io.rentACarDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACarDemo.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{


}
