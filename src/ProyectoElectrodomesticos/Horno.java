package ProyectoElectrodomesticos;

public class Horno extends ElectrodomesticoCocina implements Control{
    public Horno(String nombre, int precio, int consumo, String tipoEnergia) {
        super(nombre, precio, consumo, tipoEnergia);
    }

    @Override
    public void tipoControl() {
        System.out.println("Mi tipo de control es digital");
    }
}
