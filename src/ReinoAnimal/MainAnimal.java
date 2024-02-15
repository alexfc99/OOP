package ReinoAnimal;

public class MainAnimal {
    public static void main(String[] args) {
        Lince lince = new Lince("Lince");
        lince.comunicarse();
        lince.respirar();
        lince.cazar();
        lince.mamar();
        lince.moverse();
        System.out.println("\n");
        PezEspada pezEspada = new PezEspada("Pez Espada");
        pezEspada.comunicarse();
        pezEspada.respirar();
        pezEspada.detecta();
        pezEspada.moverse();
    }
}
