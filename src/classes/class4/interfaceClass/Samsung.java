package classes.class4.interfaceClass;

/**
 * @author Ankit Khatri
 */
public class Samsung implements Mobile{

    public String WARRENTY = "2 Year";

    @Override
    public String getBrand() {
        return "Samsung";
    }

    @Override
    public String batteryBackup() {
        return "16 hours";
    }

    @Override
    public String OperatingSystem() {
        return "Android 10";
    }

    @Override
    public String getWarrenty(){
        return "2 year";
    }
}
