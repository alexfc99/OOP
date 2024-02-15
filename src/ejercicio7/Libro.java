package ejercicio7;

import java.util.HashSet;
import java.util.Set;

public class Libro {
    private String isbn;
    private String titulo;
    private Set<Autor> autors;
    private Editorial editorial;
    private Tema tema;
    private Set<Exemplar> exemplars;

    public Libro(String isbn, String titulo, Editorial editorial, Tema tema) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autors = new HashSet<>();
        this.editorial = editorial;
        this.tema = tema;
        this.exemplars = new HashSet<>();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Autor> getAutors() {
        return autors;
    }

    public void setAutors(Set<Autor> autors) {
        this.autors = autors;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Set<Exemplar> getExemplars() {
        return exemplars;
    }

    public void setExemplars(Set<Exemplar> exemplars) {
        this.exemplars = exemplars;
    }

    public void addAutor(Autor autor){
        this.autors.add(autor);
    }
    public void addExemplar(Exemplar exemplar){
        this.exemplars.add(exemplar);
    }
    @Override
    public String toString(){return this.titulo + " - " + this.isbn;}
}
