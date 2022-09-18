
package com.bkend3.SpringBoot.Controller;

import com.bkend3.SpringBoot.model.Pais;
import com.bkend3.SpringBoot.service.IPaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPaisService paisServ;
    
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @GetMapping("/hola")
    public String decirHola(){
        return "Agregue la capa Servicio con interface";
    }
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @PostMapping("/new/pais")
    public void agregarPais(@RequestBody Pais pai){
        paisServ.crearPais(pai);
    }
        
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @GetMapping("/ver/paises")
    @ResponseBody
    public List<Pais> listarpaiss(){
        return paisServ.verPais();        
    }
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @DeleteMapping("/delete/{id}")  
    public void borrarPais(@PathVariable Long id){
        paisServ.borrarPais(id);        
    }
    
   
    
}
