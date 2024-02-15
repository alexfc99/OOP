package ReinoAnimal;

public class Lince extends Mamifero{

    public Lince(String nombre) {
        super(nombre);
    }
    public void comunicarse() {
        System.out.println("Miau");
    }
    public void cazar(){
        System.out.println("Cazo otros animales para alimentarme");
    }
}
