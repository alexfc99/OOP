package ProyectoNetwork;

import java.util.Set;

public class PublicacionImagen extends Publicacion{
    private String nomArchivo;
    private String titulo;

    public PublicacionImagen(Usuario usuario, String marcaTemp, int like, String nomArchivo, String titulo) {
        super(usuario, marcaTemp, like);
        this.nomArchivo = nomArchivo;
        this.titulo = titulo;
    }


    public String getNomArchivo() {
        return nomArchivo;
    }

    public void setNomArchivo(String nomArchivo) {
        this.nomArchivo = nomArchivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String toString(){
        return
                "Usuario: " + getUsuario() + "\n" +
                "Título: " +  this.titulo + "\n" +
                "Hora: " + getMarcaTemp() + "\n" +
                "Likes: " + getLike() + "\n" +
                "Comentarios: " + getComment() + "\n";
    }
}
