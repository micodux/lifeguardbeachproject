package net.Beaches.project.service;

import java.util.List;

import net.Beaches.project.entity.Lifeguard;

public interface LifeguardService {
    List<Lifeguard> getAllLifeguards();

    Lifeguard getLifeguardById(Long id);

    Lifeguard saveLifeguard(Lifeguard lifeguard); 
        
    Lifeguard updateLifeguard(Lifeguard lifeguard);

    void deleteLifeguardById(Long id);

    List<Lifeguard> getLifeguardsByBeachId(Long id);

    

    // Lifeguard getLifeguardByString(String email);
    }


