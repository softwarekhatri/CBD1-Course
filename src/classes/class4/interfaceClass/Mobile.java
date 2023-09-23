package classes.class4.interfaceClass;

public interface Mobile {

    String getBrand();

    public String batteryBackup();

    String OperatingSystem(); // public abstract String operatingSystem();
    // public abstract

    default String getWarrenty(){
        return "1 year";
    }

    String WARRENTY = "3 Year"; // public static final String WARRENTY = "1 Year";
}
