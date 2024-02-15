package ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Exemplar {
    private int numReg;
    private String nombre;
    private Libro libro;
    private Lector lector;
    private Set<Prestamo> prestamos;

    public Exemplar(int numReg, String nombre, Libro libro, Lector lector) {
        this.numReg = numReg;
        this.nombre = nombre;
        this.libro = libro;
        this.lector = lector;
        this.prestamos = new HashSet<>();
    }

    public int getNumReg() {
        return numReg;
    }

    public void setNumReg(int numReg) {
        this.numReg = numReg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }

    @Override
    public String toString(){return this.nombre + " - " + this.numReg;}
}
