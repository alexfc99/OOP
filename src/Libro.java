import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private List<Tema> temas;

    public Libro(String titulo, Autor autor, int paginas, List<Tema> temas) {
        this.titulo = titulo;
        this.autor = String.valueOf(autor);
        this.paginas = paginas;
        this.temas = temas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }
    @Override
    public String toString(){
        return this.titulo + " - " + this.autor + " - " + this.paginas + " pág. " + " - " + this.temas;
    }
}
