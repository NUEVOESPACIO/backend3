
package com.bkend3.SpringBoot.repository;

import com.bkend3.SpringBoot.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository <Pais, Long>{
    
}
