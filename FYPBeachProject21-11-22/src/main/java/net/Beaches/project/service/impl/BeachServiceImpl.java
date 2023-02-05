package net.Beaches.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.Beaches.project.entity.Beach;
import net.Beaches.project.repository.BeachRepository;
import net.Beaches.project.service.BeachService;
// https://www.youtube.com/watch?v=Ku3gsv7_bCc (50:15-1:51:30)
@Service
public class BeachServiceImpl implements BeachService{

	private BeachRepository BeachRepository;
	
	public BeachServiceImpl(BeachRepository BeachRepository) {
		super();
		this.BeachRepository = BeachRepository;
	}

	@Override
	public List<Beach> getAllBeaches() {
		return BeachRepository.findAll();
		
	}

	@Override
	public Beach saveBeach(Beach Beach) {
		return BeachRepository.save(Beach);
	}

	@Override
	public Beach getBeachById(Long id) {
		return BeachRepository.findById(id).get();
	}

	@Override
	public Beach updateBeach(Beach Beach) {
		return BeachRepository.save(Beach);
	}

	@Override
	public void deleteBeachById(Long id) {
		BeachRepository.deleteById(id);	
	}

	

	

}
