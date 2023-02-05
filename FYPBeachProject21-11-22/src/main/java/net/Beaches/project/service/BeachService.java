package net.Beaches.project.service;

import java.util.List;

import net.Beaches.project.entity.Beach;

public interface BeachService {
	List<Beach> getAllBeaches();
	
	Beach saveBeach(Beach Beach);
	
	Beach getBeachById(Long id);
	
	Beach updateBeach(Beach Beach);
	
	void deleteBeachById(Long id);

}
