package Subastas;

public class MainSubasta {
    public static void main(String[] args) {
        Subasta subasta1 = new Subasta("16-03-2023");
        Lote lote1 = new Lote(1772,1300);
        Articulo art1 = new Articulo("Sofá",500,lote1);
        Articulo art2 = new Articulo("Televisión",800,lote1);
        Pujador pepe = new Pujador("Pepe");
        Pujador sofia = new Pujador("Sofia");
        subasta1.addLote(lote1);
        lote1.addArticulo(art1);
        lote1.addArticulo(art2);

        System.out.println(subasta1);
        for (Lote l : subasta1.getLotes()){
            System.out.println("\t" + l);
            for (Articulo a : l.getArticulos()){
                System.out.println("\t\t" + a);
            }
        }

        System.out.println("Empieza la subasta: ");
        for (Lote l : subasta1.getLotes()){
            System.out.println("\t" + "Precio salida de: " + l + " = " + l.getPrecioSalida());
        }
        pepe.pujar(lote1,1700);
        sofia.pujar(lote1,1900);

    }
}
