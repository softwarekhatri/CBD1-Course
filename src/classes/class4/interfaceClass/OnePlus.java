package classes.class4.interfaceClass;

/**
 * @author Ankit Khatri
 */
public class OnePlus implements Mobile{
    @Override
    public String getBrand() {
        return "OnePlus";
    }

    @Override
    public String batteryBackup() {
        return "16 hours";
    }

    @Override
    public String OperatingSystem() {
        return "Android 13";
    }

}
