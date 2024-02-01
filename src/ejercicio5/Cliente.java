package ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String dni;
    private String nombre;
    private Set<Prestamo> prestamos;
    private Set<CompteCorrent> comptesCorrent;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = new HashSet<>();
        this.comptesCorrent = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Set<CompteCorrent> getComptesCorrent() {
        return comptesCorrent;
    }

    public void setComptesCorrent(Set<CompteCorrent> comptesCorrent) {
        this.comptesCorrent = comptesCorrent;
    }

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    public void addCompteCorrent(CompteCorrent compteCorrent){
        this.comptesCorrent.add(compteCorrent);
    }

    @Override
    public String toString(){return this.nombre + " - " + this.dni;}
}
