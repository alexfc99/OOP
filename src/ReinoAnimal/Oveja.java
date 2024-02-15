package ReinoAnimal;

public class Oveja extends Mamifero {

    public Oveja(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println("Beee");
    }

    public void seguirRebano(){
        System.out.println("Sigo el rebaño");
    }

}
