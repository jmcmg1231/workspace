public class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv1 = new Television("TCL", -1);
        System.out.println(tv1);
        Television tv2 = new Television("LG");
        System.out.println(tv2);
        Television tv3 = new Television();

        tv3.setVolume(100);
        tv3.setVolume(-1);
        tv3.setVolume(0);

        Television tv = new Television();
        tv.setBrand("Samsung");
        System.out.println(tv);

        tv.setBrand("LG");
        System.out.println(tv);

        tv.setBrand("Sony");
        System.out.println(tv);

        tv.setBrand("Toshiba");
        System.out.println(tv);

        tv.setBrand("Invalid");
        System.out.println(tv);

    }
}
