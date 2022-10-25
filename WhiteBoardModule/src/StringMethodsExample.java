public class StringMethodsExample {
    public static void main(String[] args) {
        //exercise contains() method
        String testStr = "Programming language Java";
        boolean contains = testStr.contains("r");
        System.out.println("Does the string 'Programming language Java' contain a r ?" +contains);

        //exercise endswith() method
        boolean contains2 = testStr.endsWith("a");
        System.out.println("Does the string 'Programming language Java' end with a?"+contains2);

        //exercise equals() method
        String str1 = "JavaScript";
        String str2 = "Python";
        boolean result = str1.equals(str2);
        System.out.println("Does Javascript equal Python: " +result);

        //exercise equalsIgnoreCase() method
        String str3 = "Javascript";
        String str4 = "javascript";
        boolean result2 = str3.equalsIgnoreCase(str4);
        System.out.println("Does Javascript equals javascript " +result2);

        //exercise indexOf() method
        String str5 = "Ruby";
        int result3 = str5.indexOf("y");
        System.out.println("the index off y in RUBY is:" +result3);

        //exercise length() method
        String str6 = "Awesome";
        int result4 = str6.length();
        System.out.println("The length of Awesome is: " +result4);

        //exercise split() method
        String str7 = "HelloWorld";
        String[] result5 = str7.split("");
        for(int i = 0; i < result5.length; i++) {
            System.out.println(result5[i]);
        }
        //exercise startsWith() method
        boolean contains4 = testStr.startsWith("P");
        System.out.println("Does the string 'Programming language Java' start with P?"+contains4);

        //exercise strip() method
        String str8 = "  Hello World    ";
        String result7 = str8.strip();
        System.out.println(result7);

        //exercise substring() method
        String str9 = "Hello World";
        String result8 = str9.substring(1);
        System.out.println(result8);

        // exercise toLowercase() method
        String str10 = "THINKVISION";
        String result9 = str10.toLowerCase();
        System.out.println(result9);

        //exercise toUpperCase() method
        String str11 = "thinkvision";
        String result10 = str11.toUpperCase();
        System.out.println(result10);

        String address = new StringBuilder(15)
        .append("48")
                .append(" ")
                .append("Birdie Dr.")
                .append("\n").toString();
        System.out.println(address);
        String ref = "ABCDE";
        boolean matches = ref.matches("[A-Z]{5}");
        System.out.println(matches);


    }
}
