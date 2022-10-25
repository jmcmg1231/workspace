public class MobileDeviceValidationTest {
    public static void main(String[] args) {
        MobileDevice mobile1 = new MobileDevice();

        mobile1.setBrand("Note 21");
        System.out.println(mobile1);

        MobileDevice mobile2 = new MobileDevice("Google Pixel 7 Pro", 1000.00);
        System.out.println(mobile2);

        MobileDevice mobile3 = new MobileDevice("Ipad ", 449.00, 10.9, MobileDeviceType.TABLET );
        System.out.println(mobile3);

        MobileDevice mobile4 = new MobileDevice("Samsung", 550.00, 11.9, MobileDeviceType.TABLET);
        System.out.println(mobile4);

        mobile4.turnOnMobileDevice(50);
        System.out.println(mobile4);
        mobile4.turnOffMobileDevice(-1);
    }

}
