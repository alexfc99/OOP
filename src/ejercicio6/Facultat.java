package ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Facultat {
    private String nomFac;
    private Set<Catedra> catedras;

    public Facultat(String nomFac) {
        this.nomFac = nomFac;
        this.catedras = new HashSet<>();
    }

    public String getNomFac() {
        return nomFac;
    }

    public void setNomFac(String nomFac) {
        this.nomFac = nomFac;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }
    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }
    @Override
    public String toString(){return "Facultad de " + this.nomFac;}
}
