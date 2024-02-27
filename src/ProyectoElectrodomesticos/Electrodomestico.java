package ProyectoElectrodomesticos;

public abstract class Electrodomestico {
    private String nombre;
    private int precio;
    private int consumo;

    public Electrodomestico(String nombre, int precio, int consumo) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n" +
                "Precio: " + this.precio + "\n" +
                "Consumo: " + this.consumo + "kW/h";
    }
}
