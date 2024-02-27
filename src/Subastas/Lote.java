package Subastas;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int numero;
    private int precio;
    private List<Articulo> articulos;
    private List<Puja> pujas;

    public Lote(int numero, int precio) {
        this.numero = numero;
        this.precio = precio;
        this.articulos = new ArrayList<>();
        this.pujas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(List<Puja> pujas) {
        this.pujas = pujas;
    }
    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }
    public void addPuja(Puja puja){
        this.pujas.add(puja);
    }
    public void getPujaMax(){
        Puja maxPuja = null;
        int max = 0;
        for (Puja puja: this.getPujas()){
            if (puja.getPuja() > max){
                max = puja.getPuja();
                maxPuja = puja;
            }
        }
    }
    public void cerrarSubasta(){

    }
    public int getPrecioSalida(){
        return this.getArticulos().stream()
                .map(Articulo::getPrecio)
                .mapToInt(Integer::valueOf)
                .sum();
    }
    @Override
    public String toString(){return "Núm. de lote: " + " " + this.numero + " - Precio: " + this.precio;}
}
