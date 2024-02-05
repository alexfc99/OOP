package ejercicio6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Adscrit {
    private String fecha;
    private Catedra catedras;
    private Professor professors;

    public Adscrit(String fecha, Catedra catedras, Professor professors) {
        this.fecha = fecha;
        this.catedras = catedras;
        this.professors = professors;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Catedra getCatedras() {
        return catedras;
    }

    public void setCatedras(Catedra catedras) {
        this.catedras = catedras;
    }

    public Professor getProfessors() {
        return professors;
    }

    public void setProfessors(Professor professors) {
        this.professors = professors;
    }

    @Override
    public String toString(){return this.fecha;}
}
