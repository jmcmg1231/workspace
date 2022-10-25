import java.util.Arrays;

public class ExerciseMain {
    public static void main(String[] args) {
        String testString = "I love Boston. Yes, you do love boston.";
        String[] strings = testString.split("[,?.@&$]+");
        int counter_index = 0;
        String[] newArray = new String[strings.length];

                for(int i = 0; i < strings.length; i++) {
                newArray[counter_index++] = strings[i].toLowerCase();
                if(newArray[counter_index].equals(strings[i])) {
                    continue;
                 }
                }
        System.out.println(Arrays.toString(newArray));
    }


}
