package refactorCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class ArrayExClient {
    public static void main(String[] args) {


        List<String> listStr = new ArrayList<>();
        listStr.add("Bobby");
        listStr.add("Charles");
        listStr.add("Porter");

        ArrayExample.convertAndDisplayNamesToUpperCase(listStr);

        List<Integer> arrayInt = new ArrayList<>();
        arrayInt.add(10);
        arrayInt.add(11);
        arrayInt.add(25);
        arrayInt.add(14);
        arrayInt.add(30);
        arrayInt.add(25);
        arrayInt.add(18);

        List<Integer> oddNumbersFromArray = ArrayExample.findOddNumbersFromArray(arrayInt);
        System.out.println(oddNumbersFromArray);

    }

}
