package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Catedra {
    private String nombreCat;
    private Departament nombre;
    private List<Professor> professors;
    private Facultat nomFac;
    private List<Adscrit> adscrits;

    public Catedra(String nombreCat, Departament nombre, Facultat nomFac) {
        this.nombreCat = nombreCat;
        this.nombre = nombre;
        this.nomFac = nomFac;
        this.adscrits = new ArrayList<>();
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }

    public Departament getNombre() {
        return nombre;
    }

    public void setNombre(Departament nombre) {
        this.nombre = nombre;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public Facultat getNomFac() {
        return nomFac;
    }

    public void setNomFac(Facultat nomFac) {
        this.nomFac = nomFac;
    }

    public List<Adscrit> getAdscrits() {
        return adscrits;
    }

    public void setAdscrits(List<Adscrit> adscrits) {
        this.adscrits = adscrits;
    }

    public void addProfessor(Professor professor){
        this.professors.add(professor);
    }
    public void addAdscrit(Adscrit adscrit){
        this.adscrits.add(adscrit);
    }

    @Override
    public String toString(){return "Cátedra de: " + this.nombreCat;}
}
