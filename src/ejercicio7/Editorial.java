package ejercicio7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Editorial {
    private String nombre;
    private int codEdit;
    private Set<Libro> libros;

    public Editorial(String nombre, int codEdit) {
        this.nombre = nombre;
        this.codEdit = codEdit;
        this.libros = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodEdit() {
        return codEdit;
    }

    public void setCodEdit(int codEdit) {
        this.codEdit = codEdit;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }
    public void addLibro(Libro libro){
        this.libros.add(libro);
    }

    @Override
    public String toString(){return this.nombre + " - " + this.codEdit;}
}
