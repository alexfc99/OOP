package ejercicio6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Departament {
    private String nombre;
    private AreaConeixement nombreAc;
    private List<Professor> professors;
    private Set<Catedra> catedras;

    public Departament(String nombre, AreaConeixement nombreAc) {
        this.nombre = nombre;
        this.nombreAc = nombreAc;
        this.professors = new ArrayList<>();
        this.catedras = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AreaConeixement getNombreAc() {
        return nombreAc;
    }

    public void setNombreAc(AreaConeixement nombreAc) {
        this.nombreAc = nombreAc;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public void addProfessor(Professor professor){
        this.professors.add(professor);
    }
    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    @Override
    public String toString(){return "Departamento: " + this.nombre;}
}
