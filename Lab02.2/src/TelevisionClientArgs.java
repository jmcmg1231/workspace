/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/**
 * Intended usage (by human):
 * $ java TelevisionClientArgs <brand> <volume> <display>
 * <p>
 * Example:
 * $ java TelevisionClientArgs Samsung 32 PLASMA
 * <p>
 * GOAL:
 * Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note = "Note: supported displays are LED, OLED, LCD, CRT, PLASMA";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType str = Television.StringToDisplayType(args[2]);

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");
        Television tv1 = new Television("Samsumg", 40, str);
        System.out.println(brand + " " + " " + volume + " " + str);


    }
}