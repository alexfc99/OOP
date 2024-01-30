public class Ordenador {
    private String marca;
    private String gama;
    private int precio;

    public Ordenador(String marca, String gama, int precio) {
        this.marca = marca;
        this.gama = gama;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){return this.marca + "-" + this.gama + "-" + this.precio + "€";}
}
