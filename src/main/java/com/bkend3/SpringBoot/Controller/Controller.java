
package com.bkend3.SpringBoot.Controller;

import com.bkend3.SpringBoot.model.Pais;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @GetMapping("/hola")
    public String decirHola(){
        return "Bienvendio a Back End Sebas con Entity creado de Pais.java y agrgado GetMapping new/pais enviado por RequestBody";
    }
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @GetMapping("/new/pais")
    public void agregarPais(@RequestBody Pais pai){
        
    }
   
    
}
