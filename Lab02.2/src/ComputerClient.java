public class ComputerClient {
    public static void main(String[] args) {
//        ComputerUsingIntPrimitives computer = new ComputerUsingIntPrimitives();
//        int addValue = computer.add(10, 20);
//        int subtractValue = computer.subtract(100, 250);
//        int multiplyValue = computer.multiply(100, 100);
//        int divideValue = computer.divide(81, 9);
//
//        System.out.println("addition int value: " + addValue + "  | subtraction int value: " + subtractValue + " | multiplication int value: " + multiplyValue + "  | division int value: " +
//                divideValue);
//
//
//        ComputerUsingLongPrimitives computer2 = new ComputerUsingLongPrimitives();
//
//        long addValue2 = computer2.add(100L, 200L);
//        long subtractValue2 = computer2.subtract(200L, 100L);
//
//
//        System.out.println("addition long value: " + addValue2 +
//                "  | subtraction long value: " + subtractValue2);
        //Juan is also making some changes
        //line 1
        //line 3 45
        System.out.println("");

        ComputerUsingOverloadedMethods computer3 = new ComputerUsingOverloadedMethods();
        int addValue3 = computer3.add(11, 21);
        int subtractValue3 = computer3.subtract(101, 252);
        long addValue4 = computer3.add(200L, 500L);
        long subtractValue4 = computer3.subtract(200L, 500L);

        System.out.println("addition int value: " + addValue3 +
                "  | subtraction int value: " + subtractValue3);
        System.out.println("addition long value: " + addValue4 +
                "  | subtraction long value: " + subtractValue4);

    }
}
