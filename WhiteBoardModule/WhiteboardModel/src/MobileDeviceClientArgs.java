public class MobileDeviceClientArgs {
    public static void main(String[] args) {
        // must first check for the presence of your (required) 4 arguments
        if (args.length < 4) {
            String usage = "Usage: java MobileDeviceClientArgs <brand> <cost> <size> <device type>";
            String example = "Example: java MobileDeviceClientArgs Apple 500.00 10 TABLET";
            String note = "Note: supported mobile devices are TABLET, EREADERS, WEARABLES, SMARTPHONES ";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }
        String brand = args[0];
        double cost = Integer.parseInt(args[1]);
        double size = Integer.parseInt(args[2]);
        MobileDeviceType mobile = MobileDevice.selectMobileDevice(args[3]);

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");
        MobileDevice device = new MobileDevice("Apple", 450.00, 10.9, MobileDeviceType.TABLET);
        System.out.println(brand+" "+" "+cost+" "+size+" "+mobile);
    }
}
