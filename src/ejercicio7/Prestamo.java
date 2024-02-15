package ejercicio7;

public class Prestamo {
    private String fecha;
    private Lector lector;
    private Exemplar exemplar;

    public Prestamo(String fecha, Lector lector, Exemplar exemplar) {
        this.fecha = fecha;
        this.lector = lector;
        this.exemplar = exemplar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }
    @Override
    public String toString(){return this.fecha;}
}
