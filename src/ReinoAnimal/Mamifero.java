package ReinoAnimal;

public abstract class Mamifero extends Animal {
    public Mamifero(String nombre) {
        super(nombre);
    }

    public void mamar(){
        System.out.println("Cuando soy pequeño mamo");
    }

    @Override
    public void respirar() {
        System.out.println("Respiro por los pulmones");
    }

    @Override
    public void moverse() {
        System.out.println("Me muevo a 4 patas");
    }
}
