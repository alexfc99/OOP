package ejercicio5;

import javax.swing.plaf.PanelUI;
import java.util.HashSet;
import java.util.Set;

public class Sucursal{
    private int n_suc;
    private String direccion;
    private Banco n_ent;
    private Set<Prestamo> prestamos;
    private Set<CompteCorrent> comptesCorrent;


    public Sucursal(int n_suc,String direccion,Banco n_ent) {
        this.n_suc = n_suc;
        this.direccion = direccion;
        this.n_ent = n_ent;
        this.prestamos = new HashSet<>();
        this.comptesCorrent = new HashSet<>();
    }

    public int getN_suc() {
        return n_suc;
    }

    public void setN_suc(int n_suc) {
        this.n_suc = n_suc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Banco getN_ent() {
        return n_ent;
    }

    public void setN_ent(Banco n_ent) {
        this.n_ent = n_ent;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Set<CompteCorrent> getComptesCorrent() {
        return comptesCorrent;
    }

    public void setComptesCorrent(Set<CompteCorrent> comptesCorrent) {
        this.comptesCorrent = comptesCorrent;
    }

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    public void addCompteCorrent(CompteCorrent compteCorrent){this.comptesCorrent.add(compteCorrent);}

    @Override
    public String toString(){return this.direccion + " - Núm. Sucursal: " + this.n_suc;}
}
