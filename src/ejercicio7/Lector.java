package ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String nombre;
    private String dni;
    private Set<Exemplar> exemplars;
    private Set<Prestamo> prestamos;

    public Lector(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.exemplars = new HashSet<>();
        this.prestamos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Exemplar> getExemplars() {
        return exemplars;
    }

    public void setExemplars(Set<Exemplar> exemplars) {
        this.exemplars = exemplars;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addExemplar(Exemplar exemplar){
        this.exemplars.add(exemplar);
    }
    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    @Override
    public String toString(){
        return this.nombre + " - " + this.dni;
    }
}
