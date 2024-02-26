package ProyectoNetwork;

import java.util.ArrayList;
import java.util.HashSet;

public class MainPublicacion {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        Usuario alex05 = new Usuario("alex05",new HashSet<>());
        usuarios.add(alex05);
        PublicacionMensaje pm1 = new PublicacionMensaje(alex05,"20:05",202,"Mi cumple es mañana",1551);
        alex05.addPublicacion(pm1);
        pm1.addComment("Que bien!!");
        pm1.addComment("Disfruta");

        PublicacionImagen pi1 = new PublicacionImagen(alex05,"17:33",189,"castellon.jpg","Ayuntamiento de Castellón");
        alex05.addPublicacion(pi1);
        pi1.addComment("Que chulo");
        pi1.addComment("WOW");

        Usuario juan99 = new Usuario("juan99",new HashSet<>());
        usuarios.add(juan99);
        PublicacionMensaje pm2 = new PublicacionMensaje(juan99,"10:39",106,"Que tal vuestro día?",2002);
        pm2.addComment("Muy bien!!");
        pm2.addComment("Genial!");
        juan99.addPublicacion(pm2);

        PublicacionImagen pi2 = new PublicacionImagen(juan99,"12:12",289,"foto.jpg","De fiesta!!");
        pi2.addComment("Que loco");
        juan99.addPublicacion(pi2);

        for (Usuario x : usuarios){
            for (Publicacion p : x.getPublicacions()){
                System.out.println(p);
            }
        }
    }
}
