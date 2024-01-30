import java.util.ArrayList;

public class MainOrdenador {
    public static void main(String[] args) {
        Ordenador o1 = new Ordenador("MSI", "Alta",2000);
        Ordenador o2 = new Ordenador("ASUS", "Baja",700);
        Ordenador o3 = new Ordenador("GIGABYTE", "Media",1300);
        ArrayList<Ordenador> ordenadores = new ArrayList<>();
        ordenadores.add(o1);
        ordenadores.add(o2);
        ordenadores.add(o3);
        System.out.println(ordenadores);
    }
}
