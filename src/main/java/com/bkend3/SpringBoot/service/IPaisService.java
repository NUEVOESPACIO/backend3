
package com.bkend3.SpringBoot.service;

import com.bkend3.SpringBoot.model.Pais;
import java.util.List;

public interface IPaisService {
    
    public List<Pais> verPais();
    
    public void crearPais(Pais pai);
    
    public void borrarPais(Long id);
    
    public Pais buscarPais(Long id);
    
}
