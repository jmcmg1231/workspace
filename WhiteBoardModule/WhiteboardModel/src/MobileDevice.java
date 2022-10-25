import java.util.Arrays;

public class MobileDevice {
    private String brand;
    private double cost;
    private double size;
    private double batteryPowerLevel = 0;


    MobileDeviceType mobile = MobileDeviceType.SMARTPHONES;

    private boolean turnOn = false;

    public static final int BATTERY_POWER_MIN = 0;
    public static final int BATTERY_POWER_MAX = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "Apple", "LG", "Google"};

    public MobileDevice() {
    }

    public MobileDevice(String brand) {
        this.brand = brand;
    }

    public MobileDevice(String brand, double cost) {
        this(brand);
        setBrand(brand);
        setCost(cost);
    }

    public MobileDevice(String brand, double cost, double size, MobileDeviceType mobile)  {
        this(brand, cost);
        setSize(size);
        setMobile(mobile);
    }

    public static MobileDeviceType selectMobileDevice(String mobile) {
        switch(mobile) {
            case "Wearables":
                return MobileDeviceType.WEARABLES;
            case "Ereaders":
                return MobileDeviceType.EREADERS;
            case "Tablet":
                return MobileDeviceType.TABLET;
            default:
                return MobileDeviceType.SMARTPHONES;

        }
    }

    public void turnOnMobileDevice(double batteryPowerLevel) {
        if(batteryPowerLevel >= BATTERY_POWER_MIN && batteryPowerLevel <= BATTERY_POWER_MAX) {
            turnOn = true;
            System.out.println("Hello...");
        } else {
            turnOn = false;
            System.out.println("Goodbye...");
        }
    }

    public void turnOffMobileDevice(double batteryPowerLevel) {
        if(batteryPowerLevel < BATTERY_POWER_MIN) {
            System.out.println("Goodbye...");
        } else {
            turnOn = true;
            System.out.println("Hello...");
        }
    }

    public static boolean isValidBrand(String brand) {
        boolean isValid = false;

        for(String validBrand : VALID_BRANDS) {
            if(validBrand.equalsIgnoreCase(brand)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(isValidBrand(brand)){
            this.brand = brand;
        }
        else {
            String brands = Arrays.toString(VALID_BRANDS);
            System.out.println("Invalid brand: " +brand+ ". Valid brands are " + brands + ".");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public MobileDeviceType getMobile() {
        return mobile;
    }

    public void setMobile(MobileDeviceType mobile) {
        this.mobile = mobile;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    @Override
    public String toString() {
        return "com.device.MobileDevice{" +
                "brand='" + brand + '\'' +
                ", cost=" + cost +
                ", size='" + size + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
