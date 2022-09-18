
package com.bkend3.SpringBoot.service;

import com.bkend3.SpringBoot.model.Pais;
import com.bkend3.SpringBoot.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService implements IPaisService {

    @Autowired
    public PaisRepository paisRepo;
    
    @Override
    public List<Pais> verPais() {        
        return paisRepo.findAll();                     
    }

    @Override
    public void crearPais(Pais pai) {
        paisRepo.save(pai);
      
    }

    @Override
    public void borrarPais(Long id) {
        paisRepo.deleteById(id);
    
    }

    @Override
    public Pais buscarPais(Long id) {
        return paisRepo.findById(id).orElse(null);
    }
    
}
