
package com.bkend3.SpringBoot.Controller;

import com.bkend3.SpringBoot.Controller.model.Persona;
import com.bkend3.SpringBoot.Controller.model.Trabajo;
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
        return "Bienvendio a Back End Sebas 6";
    }
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){        
        
    }
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @PostMapping("/new/trabajo")
    public void agregarTrabajo(@RequestBody Trabajo trab){        
        
    }
    
}
