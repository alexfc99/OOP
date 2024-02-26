package ProyectoNetwork;

import java.util.Set;

public class PublicacionMensaje extends Publicacion {
    private String mensaje;
    private int id;

    public PublicacionMensaje(Usuario usuario, String marcaTemp, int like, String mensaje,int id) {
        super(usuario, marcaTemp, like);
        this.mensaje = mensaje;
        this.id = id;
    }


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return
                "Usuario: " + getUsuario() + "\n" +
                "Mensaje: " + this.mensaje + "\n" +
                "Hora: " + getMarcaTemp() + "\n" +
                "Likes: " + getLike() + "\n" +
                "Comentarios: " + getComment() + "\n";
    }
}
