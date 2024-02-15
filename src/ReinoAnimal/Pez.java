package ReinoAnimal;

public abstract class Pez extends Animal{
    public Pez(String nombre) {
        super(nombre);
    }
    @Override
    public void comunicarse() {
        System.out.println("Me comunico con burbujas");
    }
    @Override
    public void respirar() {
        System.out.println("Respiro por las branquias");
    }
    @Override
    public void moverse() {
        System.out.println("Me muevo nadando con mis aletas");
    }
}
