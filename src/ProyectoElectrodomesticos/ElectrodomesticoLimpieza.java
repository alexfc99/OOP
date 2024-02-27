package ProyectoElectrodomesticos;

public class ElectrodomesticoLimpieza extends Electrodomestico{
    private String producto;

    public ElectrodomesticoLimpieza(String nombre, int precio, int consumo, String producto) {
        super(nombre, precio, consumo);
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + "\n" +
                "Producto a usar: " + this.producto + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "Consumo: " + getConsumo() + "kW/h";
    }
}
