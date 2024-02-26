package ProyectoNetwork;

import java.util.HashSet;
import java.util.Set;

public abstract class Publicacion {
    private Usuario usuario;
    private String marcaTemp;
    private int like;
    private Set<String> comment;

    public Publicacion(Usuario usuario, String marcaTemp, int like) {
        this.usuario = usuario;
        this.marcaTemp = marcaTemp;
        this.like = like;
        this.comment = new HashSet<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMarcaTemp() {
        return marcaTemp;
    }

    public void setMarcaTemp(String marcaTemp) {
        this.marcaTemp = marcaTemp;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public Set<String> getComment() {
        return comment;
    }

    public void setComment(Set<String> comment) {
        this.comment = comment;
    }
    public void addComment(String comment){
        this.comment.add(comment);
    }
    @Override
    public String toString(){
        return
            "Usuario: " + this.usuario + "\n" +
            "Hora: " + this.marcaTemp + "\n" +
            "Likes: " + this.like + "\n" +
            "Comentarios: " + this.comment + " - ";
    }
}
