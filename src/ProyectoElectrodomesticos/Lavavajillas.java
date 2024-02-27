package ProyectoElectrodomesticos;

public class Lavavajillas extends ElectrodomesticoLimpieza implements Control{
    public Lavavajillas(String nombre, int precio, int consumo, String producto) {
        super(nombre, precio, consumo, producto);
    }

    @Override
    public void tipoControl() {
        System.out.println("Mi tipo de control es táctil");
    }
}
