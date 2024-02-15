package ejercicio7;
public class MainLibro {
    public static void main(String[] args) {
        Autor autor1 = new Autor(17,"Rebecca Yarros");
        Tema tema1 = new Tema("Fantasía",711);
        Editorial edit1 = new Editorial("Editorial Planeta",1002);
        Libro libro1 = new Libro("9788408284550","ALAS DE HIERRO",edit1,tema1);
        Libro libro2 = new Libro("9788408279990","ALAS DE SANGRE",edit1,tema1);
        Lector maria = new Lector("Maria","20774521C");
        Lector juan = new Lector("Juan","20472811T");
        Exemplar ex1 = new Exemplar(35,"Alas de hierro",libro1,juan);
        Exemplar ex2 = new Exemplar(37,"Alas de sangre",libro2,maria);
        Prestamo pres1 = new Prestamo("20-06-2022",juan,ex1);
        Prestamo pres2 = new Prestamo("12-04-2015",maria,ex2);
        autor1.addLibros(libro1);
        autor1.addLibros(libro2);
        libro1.addAutor(autor1);
        libro2.addAutor(autor1);
        tema1.addLibro(libro1);
        tema1.addLibro(libro2);
        edit1.addLibro(libro1);
        edit1.addLibro(libro2);
        juan.addPrestamo(pres1);
        maria.addPrestamo(pres2);
        ex1.addPrestamo(pres1);
        ex2.addPrestamo(pres2);
        libro1.addExemplar(ex1);
        libro2.addExemplar(ex2);
        juan.addExemplar(ex1);
        maria.addExemplar(ex2);

        System.out.println(autor1);
        for (Libro s : autor1.getLibros()) {
            System.out.println("\t" + s);
            System.out.println("\t" + s.getTema());
            System.out.println("\t" + s.getEditorial());
            for (Exemplar e: s.getExemplars()){
                System.out.println("\t\t" + e);
                System.out.println("\t\t" + e.getLector());
                for (Prestamo p : e.getPrestamos()){
                    System.out.println("\t\t" + p);
                }
            }
        }
    }
}
