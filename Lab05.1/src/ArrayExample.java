import java.util.Arrays;
public class ArrayExample {
    private static String[] arrayStr = {"Marissa", "Charles", "Porter"};

    public static void convertAndDisplayNamesToUpperCase() {
        for (int i = 0; i < arrayStr.length; i++) {
            String str = arrayStr[i].toUpperCase();
            System.out.println(str);
        }

    }

    public static int[] findOddNumbersFromArray(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 1) {
                count++;
            }
        }

        int[] oddArray = new int[count];
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                oddArray[j++] = numbers[i];
            }
        }
        return oddArray;
    }

    public static int findLargestNumberFromArray(int[] numbers) {
        int largestNumber = numbers[0];
        for(int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {
            if(numbers[currentIndex] > largestNumber) {
                largestNumber = numbers[currentIndex];
            }
        }
        return largestNumber;
    }

}

