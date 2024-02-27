package ProyectoElectrodomesticos;

public class Vitroceramica extends ElectrodomesticoLimpieza implements Control{
    public Vitroceramica(String nombre, int precio, int consumo, String producto) {
        super(nombre, precio, consumo, producto);
    }

    @Override
    public void tipoControl() {
        System.out.println("Mi tipo de control es táctil");
    }
}
