
package com.bkend3.SpringBoot.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @GetMapping("/hola")
    public String decirHola(){
        return "Bienvendio a Back End Sebas 9";
    }
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angularseba.web.app"})
    @GetMapping("/chau")
    public String decirChau(){
        return "Adios a Back End Sebas 9";
    }
   
    
}
