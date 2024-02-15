package ProyectoTrabajadores;

public class MainProyecto {
    public static void main(String[] args) {
        Directivo maria = new Directivo("Maria");
        Oficial juan = new Oficial("Juan");
        Tecnico paula = new Tecnico("Paula");

        System.out.println(maria);
        System.out.println(juan);
        System.out.println(paula);
    }
}
