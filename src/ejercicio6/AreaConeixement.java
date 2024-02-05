package ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class AreaConeixement {
    private String nombreAc;
    private Set<Departament> departaments;

    public AreaConeixement(String nombreAc, Set<Departament> departaments) {
        this.nombreAc = nombreAc;
        this.departaments = new HashSet<>();
    }

    public String getNombreAc() {
        return nombreAc;
    }

    public void setNombreAc(String nombreAc) {
        this.nombreAc = nombreAc;
    }

    public Set<Departament> getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Set<Departament> departaments) {
        this.departaments = departaments;
    }
    public void addDepartament(Departament departament){
        this.departaments.add(departament);
    }

    @Override
    public String toString(){return "Área de " + this.nombreAc;}
}
