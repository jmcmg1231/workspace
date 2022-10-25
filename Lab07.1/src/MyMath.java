public class MyMath {

    public static final int MINIMUM_AGE = 5;
    public static final int MAXIMUM_AGE = 100;


    public static boolean isAgeInRange(int age) {
        if(age <= MAXIMUM_AGE && age >= MINIMUM_AGE) {
            return true;
        } else {
            return false;
        }
    }

    public static int min(int x, int y) {
        if(x < y)  {
           return x;
        } else {
            return y;
        }
    }

    public static int max(int x, int y) {
        if(x > y)  {
            return x;
        } else {
            return y;
        }
    }
}
