public class MainAireAcondicionado {
    public static void main(String[] args) {
        AireAcondicionado a1 = new AireAcondicionado("HITACHI",34,35,10);
        AireAcondicionado a2 = new AireAcondicionado("TOSHIBA",11,35,10);
        AireAcondicionado a3 = new AireAcondicionado("FUJITSU",20,35,10);
        a1.subirTemp();
        a1.subirTemp();
        System.out.println(a1);
        a2.bajarTemp();
        a2.bajarTemp();
        System.out.println(a2);
        a3.subirTemp();
        System.out.println(a3);
    }
}
