
package com.bkend3.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Pais {    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    private Long id;
    private String nombre;
    private String presidente;
    
    public Pais() {}
    
    public Pais(Long id, String nombre, String presidente) {
        
        this.id=id;
        this.nombre=nombre;
        this.presidente=presidente;
        
    }
    
}


