public class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television("Samsung" , 40);

        tv.toggleOnOff();
        System.out.println(tv);

        tv.toggleOnOff();
        System.out.println(tv);

        tv.toggleOnOff();
        System.out.println(tv);

        tv.setVolume(50);
        System.out.println(tv);

    }
}
