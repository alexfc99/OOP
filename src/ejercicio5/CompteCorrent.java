package ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class CompteCorrent {
    private int n_cc;
    private int cantidad;
    private Sucursal sucursal;
    private Set<Cliente> clientes;
    private Set<Domiciliacion> domiciliaciones;


    public CompteCorrent(int n_cc, int cantidad,Sucursal sucursal) {
        this.n_cc = n_cc;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.clientes = new HashSet<>();
        this.domiciliaciones = new HashSet<>();
    }

    public int getN_cc() {
        return n_cc;
    }

    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursales) {
        this.sucursal = sucursales;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Set<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void setDomiciliaciones(Set<Domiciliacion> domiciliaciones) {
        this.domiciliaciones = domiciliaciones;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    public void addDomiciliacion(Domiciliacion domiciliacion){
        this.domiciliaciones.add(domiciliacion);
    }

    @Override
    public String toString(){return "Núm. de C.Corriente: " + this.n_cc + " - " + this.cantidad + "€";}
}
