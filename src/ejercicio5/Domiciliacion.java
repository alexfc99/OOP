package ejercicio5;

public class Domiciliacion {
    private int n_dom;
    private String nombre;
    private CompteCorrent compteCorrent;

    public Domiciliacion(int n_dom, String nombre, CompteCorrent compteCorrent) {
        this.n_dom = n_dom;
        this.nombre = nombre;
        this.compteCorrent = compteCorrent;
    }

    public int getN_dom() {
        return n_dom;
    }

    public void setN_dom(int n_dom) {
        this.n_dom = n_dom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CompteCorrent getCompteCorrent() {
        return compteCorrent;
    }

    public void setCompteCorrent(CompteCorrent compteCorrent) {
        this.compteCorrent = compteCorrent;
    }
    @Override
    public String toString(){return this.nombre + " - " + this.n_dom;}
}
