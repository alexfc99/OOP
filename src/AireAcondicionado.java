public class AireAcondicionado {
    private String nombre;
    private int temperaturaMax;
    private int temperaturaMin;
    private int temperatura;


    public AireAcondicionado(String nombre, int temperatura,int temperaturaMax, int temperaturaMin) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(int temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public int getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(int temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }
    public int subirTemp(){
            return temperatura++;
    }
    public int bajarTemp(){
        return temperatura --;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString(){
        if (temperatura > temperaturaMax){
            return this.nombre + " / " + this.temperaturaMax + "ºC";
        } else if (temperatura < temperaturaMin) {
            return this.nombre + " / " + this.temperaturaMin + "ºC";
        }else {
            return this.nombre + " / " + this.temperatura + "ºC";
        }
    }
}
