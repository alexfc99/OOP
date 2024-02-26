package ProyectoNetwork;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nombre;
    private Set<Publicacion> publicacions;

    public Usuario(String nombre, Set<Publicacion> publicacions) {
        this.nombre = nombre;
        this.publicacions = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Publicacion> getPublicacions() {
        return publicacions;
    }

    public void setPublicacions(Set<Publicacion> publicacions) {
        this.publicacions = publicacions;
    }
    public void addPublicacion(Publicacion publicacion){
        this.publicacions.add(publicacion);
    }
    @Override
    public String toString(){return this.nombre;}
}
