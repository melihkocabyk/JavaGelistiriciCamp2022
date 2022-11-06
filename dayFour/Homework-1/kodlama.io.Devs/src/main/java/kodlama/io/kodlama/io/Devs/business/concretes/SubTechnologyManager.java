package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.SubTechnologyService;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.SubTechnologyRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechnologyService {

	private SubTechnologyRepository subTechnologyRepository;
	
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository) {
		this.subTechnologyRepository = subTechnologyRepository;
	}
	@Override
	public List<SubTechnology> getAll() {
		
		return subTechnologyRepository.findAll();
	}
	@Override
	public SubTechnology getById(int id) {
		
		return subTechnologyRepository.findById(id).get();
	}
	@Override
	public void add(SubTechnology subTechnology) {
		subTechnologyRepository.save(subTechnology);
	}
	@Override
	public void remove(int id) {
		subTechnologyRepository.deleteById(id);
	}
	@Override
	public void update(SubTechnology subTechnology) {
		subTechnologyRepository.save(subTechnology);
	}
}
