package net.Beaches.project.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.Beaches.project.entity.Lifeguard;

public interface LifeguardRepository extends JpaRepository<Lifeguard, Long>{

    List<Lifeguard> findByBeachId(Long beachId);
    

}
