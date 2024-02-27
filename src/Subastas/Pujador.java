package Subastas;

import java.util.ArrayList;
import java.util.List;

public class Pujador {
    private String nombre;
    private List<Puja> puja;

    public Pujador(String nombre) {
        this.nombre = nombre;
        this.puja = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Puja> getPuja() {
        return puja;
    }

    public void setPuja(List<Puja> puja) {
        this.puja = puja;
    }

    public void pujar(Lote lote, int cantidad){
        Puja puja1 = new Puja(this,lote,cantidad);
        this.puja.add(puja1);
        lote.addPuja(puja1);

    }
}
