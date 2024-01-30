public class MainCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Paco",22400.45);
        Cuenta c2 = new Cuenta("Pepe",3400.00);
        Cuenta c3 = new Cuenta("Maria");
        Cuenta c4 = new Cuenta("Juan",200);
        Cuenta c5 = new Cuenta("Paula",1300.44);
        c1.ingresar(200);
        System.out.println(c1);
        c2.retirar(150);
        System.out.println(c2);
        c3.ingresar(345.32);
        System.out.println(c3);
        c4.retirar(300);
        System.out.println(c4);
        c5.ingresar(-300);
        System.out.println(c5);
    }
}
