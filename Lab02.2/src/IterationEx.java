public class IterationEx {
    public static void displayNumbersUsingForLoop(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i);
        }
    }

    public static void displayNumbersUsingWhile(int start, int end) {
        while (start < end) {
            start++;
            System.out.print(start);
        }
    }

    public static void displayNumbersUsingDoWhile(int start, int end) {
        do {
            start++;
            System.out.print(start);
        } while (start < end);
        {
        }
    }


    public static void displayEvenNumbersOnlyUsingForLoop(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }
}








