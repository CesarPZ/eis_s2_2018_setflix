package model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Serie {

    private String nombre;
    private String temporadas;
    private String estado;


    @JsonCreator
    public Serie(@JsonProperty("nombre") String nombre,
                 @JsonProperty("temporadas") String temporadas,
                 @JsonProperty("estado") String estado){
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
         this.nombre = nombre;
    }

    public String getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }


    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
