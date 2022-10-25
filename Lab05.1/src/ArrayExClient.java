import java.util.Arrays;

public class ArrayExClient {
    public static void main(String[] args) {
        ArrayExample.convertAndDisplayNamesToUpperCase();

        int[] array = {1, 2, 3, 4, 6, 8, 9};
        int[] oddNumbersFromArray = ArrayExample.findOddNumbersFromArray(array);
        String s = Arrays.toString(oddNumbersFromArray);
        System.out.println(s);

    }
}
