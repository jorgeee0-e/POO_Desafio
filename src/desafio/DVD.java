/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;
import java.time.LocalTime;
import desafio.utilities;

/**
 *
 * @author Jorge LG
 */
public class DVD extends Material{
    private String director;
    private LocalTime duracion;
    private String genero;

    public DVD(String director, String duracionStr, String genero, String L2, String tipo, String id, String titulo) {
        super(L2, tipo, id, titulo);
        this.director = director;
        this.duracion = utilities.parseDuracion(duracionStr);
        this.genero = genero;
    }

    

    public String getDirector() {
        return director;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
     
    
}
