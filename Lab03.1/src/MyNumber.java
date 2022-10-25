public class MyNumber {
    public static int computeRandomInt(int start, int end) {
        return ((int) (Math.random()*(start - end))) + end;
    }
}
