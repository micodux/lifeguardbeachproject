package net.Beaches.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.Beaches.project.entity.Lifeguard;
import net.Beaches.project.repository.LifeguardRepository;
import net.Beaches.project.service.LifeguardService;

@Service
public class LifeguardServiceImpl implements LifeguardService{

	@Autowired
	private LifeguardRepository LifeguardRepository;
	
	public LifeguardServiceImpl( LifeguardRepository LifeguardRepository) {
		super();
		this.LifeguardRepository = LifeguardRepository;
	}

    @Override
    public List<Lifeguard> getAllLifeguards() {
        return LifeguardRepository.findAll();
    }

	@Override
	public Lifeguard getLifeguardById(Long id) {
		return LifeguardRepository.findById(id).get();
	}	
	
	@Override
	public Lifeguard updateLifeguard(Lifeguard Lifeguard) {
		return LifeguardRepository.save(Lifeguard);
	}

	@Override
	public void deleteLifeguardById(Long id) {
		LifeguardRepository.deleteById(id);	
	}

	@Override
	public Lifeguard saveLifeguard(Lifeguard lifeguard) {
		return  LifeguardRepository.save(lifeguard);
	}


	public List<Lifeguard> getLifeguardsByBeachId(Long beachId) {
        return LifeguardRepository.findByBeachId(beachId);
    }

}
