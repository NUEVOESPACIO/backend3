package com.bkend3.SpringBoot.repository;

import com.bkend3.SpringBoot.Controller.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
    
}
