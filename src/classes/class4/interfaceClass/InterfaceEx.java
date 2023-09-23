package classes.class4.interfaceClass;

public class InterfaceEx {

    public static void main(String[] args) {
        Samsung mobile = new Samsung();
        mobile.WARRENTY = "3 years";
        System.out.println(mobile.getBrand());
        System.out.println(mobile.OperatingSystem());
        System.out.println(mobile.WARRENTY);
        System.out.println(mobile.getWarrenty());
//        Mobile.WARRENTY = "2 years";
    }
}
