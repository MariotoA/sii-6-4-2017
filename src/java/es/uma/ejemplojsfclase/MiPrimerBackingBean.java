/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.ejemplojsfclase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alumno
 */
@Named(value = "backing") // nombre introducido
@RequestScoped
public class MiPrimerBackingBean {
    
    private Integer numero;
    /**
     * Creates a new instance of MiPrimerBackingBean
     */
    public MiPrimerBackingBean() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public List<Integer> getDivisores() {
        if (numero == null) {
            return new ArrayList<>();
        }
        int[] list = IntStream.rangeClosed(1, numero)
                .filter(i -> (numero % i == 0)).toArray();
        List<Integer> l = new ArrayList<>();
        for (Integer in : list) {
            l.add(in);
        }
        return l;
    }
    
    public String accion() {
        numero*=2;
        return null; // si se devuelve null jsf entiende volver 
        //a la misma pagina
    }
    
}
