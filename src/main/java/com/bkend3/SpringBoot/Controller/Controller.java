
package com.bkend3.SpringBoot.Controller;

import com.bkend3.SpringBoot.model.Pais;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @GetMapping("/hola")
    public String decirHola(){
        return "Tiene Repository JPA interface en proceso de desarrollo y nuevo modelo bandera";
    }
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @PostMapping("/new/pais")
    public String agregarPais(@RequestBody Pais pai){
        
        return "Agregado Clase Repostiry modelo badnera";
        
    }
   
    
}
