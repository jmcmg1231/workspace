import java.util.EnumSet;

public class MyFamilyMain {

    public static void main(String[] args) {

        MyFamily[] members = MyFamily.values();
        for(MyFamily member : members) {
            System.out.println(member);
        }

        for(MyFamily members2 : EnumSet.range(MyFamily.MARISSA, MyFamily.PORTER)){
            System.out.print(members2 + " ");
        }
    }
}
