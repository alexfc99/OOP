package ProyectoElectrodomesticos;

public class Lavadora extends ElectrodomesticoLimpieza implements Control {
    public Lavadora(String nombre, int precio, int consumo, String producto) {
        super(nombre, precio, consumo, producto);
    }

    @Override
    public void tipoControl() {
        System.out.println("Mi tipo control es analógico");
    }
}
