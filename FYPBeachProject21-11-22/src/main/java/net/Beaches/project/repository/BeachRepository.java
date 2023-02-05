package net.Beaches.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import net.Beaches.project.entity.Beach;

public interface BeachRepository extends JpaRepository<Beach, Long>{

    

}
