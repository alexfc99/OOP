package ejercicio5;

import java.util.HashSet;

public class MainBanco {
    public static void main(String[] args) {

        Banco bbva = new Banco("BBVA",204,new HashSet<>());
        Sucursal sBbva = new Sucursal(22,"C/ Mayor",bbva);
        Cliente pedro = new Cliente("20764977T","Pedro");
        Prestamo pres1 = new Prestamo(12,1000,sBbva, pedro);
        CompteCorrent compte1 = new CompteCorrent(164222,7680,sBbva);
        Domiciliacion dom1 = new Domiciliacion(291,"Iberdrola",compte1);
        pedro.addPrestamo(pres1);
        bbva.addSucursal(sBbva);
        sBbva.addPrestamo(pres1);
        sBbva.addCompteCorrent(compte1);
        compte1.addCliente(pedro);
        pedro.addCompteCorrent(compte1);
        compte1.addDomiciliacion(dom1);

        System.out.println(bbva);
        for (Sucursal s : bbva.getSucursales()){
            System.out.println("\t" + s);
            for (Prestamo p : s.getPrestamos()){
                System.out.println("\t\t" + p);
                System.out.println("\t\t" + p.getCliente());
                for (CompteCorrent a : s.getComptesCorrent()) {
                    System.out.println("\t\t\t" + a);
                    System.out.println("\t\t\t" + a.getDomiciliaciones()) ;
                }
            }
        }

        Banco santander = new Banco("SANTANDER",207,new HashSet<>());
        Sucursal sSant = new Sucursal(27,"C/ Jose Miguel V",santander);
        Cliente maria = new Cliente("20762347H","Maria");
        Prestamo pres2 = new Prestamo(19,2040,sSant, maria);
        CompteCorrent compte2 = new CompteCorrent(883900,3500,sSant);
        Domiciliacion dom2 = new Domiciliacion(776,"Facsa",compte2);
        maria.addPrestamo(pres2);
        santander.addSucursal(sSant);
        sSant.addCompteCorrent(compte2);
        sSant.addPrestamo(pres2);
        compte2.addCliente(maria);
        maria.addCompteCorrent(compte2);
        compte2.addDomiciliacion(dom2);

        System.out.println(santander);
        for (Sucursal s : santander.getSucursales()){
            System.out.println("\t" + s);
            for (Prestamo p : s.getPrestamos()){
                System.out.println("\t\t" + p);
                System.out.println("\t\t" + p.getCliente());
                for (CompteCorrent a : sSant.getComptesCorrent()){
                    System.out.println("\t\t\t\t" + a);
                    System.out.println("\t\t\t\t" + a.getDomiciliaciones());
                }
            }
        }
    }
}
