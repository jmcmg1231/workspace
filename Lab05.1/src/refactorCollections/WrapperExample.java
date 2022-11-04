package refactorCollections;

public class WrapperExample {
    public static int convertStringToIntPrimitive(String toBeConvertedString) {
        int convertedValue = Integer.parseInt(toBeConvertedString);
        return convertedValue;
    }

    public static Object convertStringToIntegerObject(String toBeConvertedString) {
        Object integer = toBeConvertedString;
        return integer;
    }
}
