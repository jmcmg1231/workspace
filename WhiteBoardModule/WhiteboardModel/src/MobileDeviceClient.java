public class MobileDeviceClient {
    public static void main(String[] args) {
        MobileDevice device = new MobileDevice("Apple");

        device.setCost(449.00);
        device.setSize(10.9);
        System.out.println(device);
        device.turnOnMobileDevice(99);
        device.turnOnMobileDevice(-1);
        System.out.println("");
        device.isValidBrand("Panasonic");
        System.out.println(" ");
        MobileDevice device1 = new MobileDevice("TCL", 440.00);
        device1.setSize(11.9);
        device1.setMobile(MobileDeviceType.SMARTPHONES);
        System.out.println(device1);

        System.out.println("");

    }
}
