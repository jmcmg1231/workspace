package refactorCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayExample {
//    private static Collection<String> listStr = new ArrayList<>();


    public static void convertAndDisplayNamesToUpperCase(List<String> listStr) {
        for (int i = 0; i < listStr.size(); i++) {
            String str = listStr.get(i).toUpperCase();
            System.out.println(str);
        }

    }

    public static List<Integer> findOddNumbersFromArray(List<Integer> arrayInt) {
//        int count = 0;
//        for (int i = 0; i < arrayInt.size(); i++) {
//            if(arrayInt.get(i) % 2 == 1) {
//                count++;
//            }
//        }

        List<Integer> oddArray = new ArrayList<>();
        for (int i = 0; i < arrayInt.size(); i++) {
            if (arrayInt.get(i) % 2 == 1) {
                oddArray.add(arrayInt.get(i));
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

