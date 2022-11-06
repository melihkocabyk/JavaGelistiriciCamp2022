package kodlama.io.kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.concretes.SubTechnology;

public interface SubTechnologyService {

	List<SubTechnology> getAll();
	SubTechnology getById(int id);
	void add(SubTechnology subTechnology);
	void remove(int id);
	void update(SubTechnology subTechnology);
}
