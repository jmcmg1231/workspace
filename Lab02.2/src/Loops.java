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
               int[] ageArray = {15,18,21,7,22,45,77,88,6};
               String[] names = {"sang", "cindy", "jason"};

               Loops.printName(names);
               Loops.agePricing(ageArray);


     }
}

