package ejercicio6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Professor {
    private String nom;
    private int edad;
    private String dni;
    private Departament nombre;
    private Set<Catedra> catedras;
    private List<Adscrit> adscrits;

    public Professor(String nom, int edad, String dni, Departament nombre) {
        this.nom = nom;
        this.edad = edad;
        this.dni = dni;
        this.nombre = nombre;
        this.catedras = new HashSet<>();
        this.adscrits = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Departament getNombre() {
        return nombre;
    }

    public void setNombre(Departament nombre) {
        this.nombre = nombre;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public List<Adscrit> getAdscrits() {
        return adscrits;
    }

    public void setAdscrits(List<Adscrit> adscrits) {
        this.adscrits = adscrits;
    }

    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }
    public void addAdscrit(Adscrit adscrit){
        this.adscrits.add(adscrit);
    }
    @Override
    public String toString(){return this.nom + " - " + this.edad + " - " + this.dni;}
}
