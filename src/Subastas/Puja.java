package Subastas;

public class Puja {
    private Pujador pujador;
    private Lote lote;
    private int puja;

    public Puja(Pujador pujador, Lote lote, int puja) {
        this.pujador = pujador;
        this.lote = lote;
        this.puja = puja;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public int getPuja() {
        return puja;
    }

    public void setPuja(int puja) {
        this.puja = puja;
    }
    @Override
    public String toString(){return this.puja + "";}
}
