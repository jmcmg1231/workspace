import java.util.Arrays;

public class Loops {

     public static void agePricing(int[] array) {
          for (int i = 0; i < array.length; i++) {
               if (array[i] >= 17 && array[i] <= 21) {
                    System.out.println("You pay $18.00");
               } else if(array[i] > 21 && array[i] < 65) {
                    System.out.println("You pay $22.00");
               } else if(array[i] < 17) {
                    System.out.println("Admission free");
               } else {
                    System.out.println("You pay $10.00");
               }
          }
     }

     public static void printName(String[] array) {
          for(String name : array) {
               System.out.println(name);
          }
     }
}

class Main {
     public static void main(String[] args) {
//               int[] ageArray = {15,18,21,7,22,45,77,88,6};
//               String[] names = {"sang", "cindy", "jason"};
//
//               Loops.printName(names);
//               Loops.agePricing(ageArray);
          String str = "Hello I love Boston.  Yes, you do Love Boston.";
          String[] arrayStr = str.replaceAll("[^a-zA-z]", " ").split("\\s+");

          for (int i = 0; i < arrayStr.length-1; i++) {
               int count =0;
               for (int j = i + 1; j < arrayStr.length; j++) {
                    if (arrayStr[i] == arrayStr[j]) {
                         count++;
                    } else {
                         break;
                    }
               }
               System.out.println(arrayStr[i] + ":" + count);
          }
     }
}

