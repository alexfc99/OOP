import java.util.ArrayList;
import java.util.List;

public class MainLibro {
    public static void main(String[] args) {
        Autor autor1 = new Autor("VÍCTOR RUIZ ALDANA","20-03-1985");
        Tema tema1 = new Tema("Juvenil");
        Tema tema2 = new Tema("Fantasía");
        List<Tema> temas = new ArrayList<>();
        temas.add(tema1);
        temas.add(tema2);
        Libro libro1 = new Libro("ALAS DE HIERRO ",autor1,565,temas);
        System.out.println(libro1);
        Autor autor2 = new Autor("ALI HAZELWOOD","15-08-1993");
        Tema tema3 = new Tema("Novela romántica");
        temas = new ArrayList<>();
        temas.add(tema3);
        Libro libro2 = new Libro("NOVIA",autor2,498,temas);
        System.out.println(libro2);
    }
}
