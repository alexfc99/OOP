package ejercicio6;

import ejercicio5.Sucursal;

import java.util.HashSet;

public class MainUniversidad {
    public static void main(String[] args) {

        AreaConeixement ac1 = new AreaConeixement("Historia del arte",new HashSet<>());
        Departament depHis = new Departament("Historia",ac1);
        Departament depLeng = new Departament("Lengua",ac1);
        Professor prof1 = new Professor("Paco",32,"20932277L",depHis);
        Professor prof2 = new Professor("Maria",55,"29320201X",depHis);
        Professor prof3 = new Professor("Juan",27,"28653342T",depLeng);
        Facultat fac1 = new Facultat("Historia y Geografía");
        Catedra cat1 = new Catedra("Investigación",depHis,fac1);
        Catedra cat2 = new Catedra("Literatura",depLeng,fac1);
        Adscrit ad1 = new Adscrit("20-12-2021",cat1,prof1);
        Adscrit ad2 = new Adscrit("07-04-2015",cat1,prof2);
        Adscrit ad3 = new Adscrit("31-01-2022",cat2,prof3);
        ac1.addDepartament(depHis);
        ac1.addDepartament(depLeng);
        depLeng.addProfessor(prof3);
        depHis.addProfessor(prof1);
        depHis.addProfessor(prof2);
        depHis.addCatedra(cat1);
        depLeng.addCatedra(cat2);
        fac1.addCatedra(cat1);
        fac1.addCatedra(cat2);
        prof1.addAdscrit(ad1);
        prof2.addAdscrit(ad2);
        prof3.addAdscrit(ad3);

        System.out.println(ac1);
        for (Departament s : ac1.getDepartaments()) {
            System.out.println("\t" + s);
            for (Professor p : s.getProfessors()){
                System.out.println("\t\t" + p);
                System.out.println("\t\t" + p.getAdscrits());
            }
            for (Catedra c : s.getCatedras()){
                System.out.println("\t\t\t" + c);
                System.out.println("\t\t\t" + c.getNomFac());
            }
        }
    }
}
