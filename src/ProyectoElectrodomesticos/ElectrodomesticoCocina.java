package ProyectoElectrodomesticos;

import java.util.HashSet;
import java.util.Set;

public class ElectrodomesticoCocina extends Electrodomestico{
    private String tipoEnergia;
    private Set<String> alimentos;
    public ElectrodomesticoCocina(String nombre, int precio, int consumo, String tipoEnergia) {
        super(nombre, precio, consumo);
        this.tipoEnergia = tipoEnergia;
        this.alimentos = new HashSet<>();
    }

    public String getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(String tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    public Set<String> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(Set<String> alimentos) {
        this.alimentos = alimentos;
    }
    public void addAlimentos(String alimento){
        this.alimentos.add(alimento);
    }
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + "\n" +
                "Tipo de energia: " + this.tipoEnergia + "\n" +
                "Alimentos que puedes cocinar: " + this.alimentos + "\n" +
                "Precio: " + getPrecio() + "\n" +
                "Consumo: " + getConsumo() + "kW/h";
    }
}
