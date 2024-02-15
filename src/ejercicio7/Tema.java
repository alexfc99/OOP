package ejercicio7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tema {
    private String nombre;
    private int codTem;
    private Set<Libro> libros;

    public Tema(String nombre, int codTem) {
        this.nombre = nombre;
        this.codTem = codTem;
        this.libros = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodTem() {
        return codTem;
    }

    public void setCodTem(int codTem) {
        this.codTem = codTem;
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
    public String toString(){return this.nombre + " - " + this.codTem;}
}
