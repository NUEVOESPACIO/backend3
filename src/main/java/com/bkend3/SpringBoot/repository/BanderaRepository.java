
package com.bkend3.SpringBoot.repository;

import com.bkend3.SpringBoot.model.Bandera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanderaRepository extends JpaRepository <Bandera, Long>{
    
}
