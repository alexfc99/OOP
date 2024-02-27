package Subastas;

import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private String fecha;
    private List<Lote> lotes;

    public Subasta(String fecha) {
        this.fecha = fecha;
        this.lotes = new ArrayList<>();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }

    public void addLote(Lote lote){
        this.lotes.add(lote);
    }

    @Override
    public String toString(){return this.fecha;}
}
