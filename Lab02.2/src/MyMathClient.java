public class MyMathClient {

    public static void main(String[] args) {
        int maxResult = MyMath.max(100,50);
        System.out.println(maxResult);

        int minResult = MyMath.min(100,50);
        System.out.println(minResult);

        boolean ageResult = MyMath.isAgeInRange(100);
        boolean ageResult2 = MyMath.isAgeInRange(101);
        boolean ageResult3 = MyMath.isAgeInRange(4);
        boolean ageResult4 = MyMath.isAgeInRange(-1);
        boolean ageResult5 = MyMath.isAgeInRange(5);

        System.out.println(ageResult);
        System.out.println(ageResult2);
        System.out.println(ageResult3);
        System.out.println(ageResult4);
        System.out.println(ageResult5);
    }


}
