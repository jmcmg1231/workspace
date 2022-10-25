public class MyPerson {

    private int x = 5;
    private String name = "Juan";


    public int someMethod(int arg) {
        int counter = 0;
        for(int i = 0; i < arg; i++) {
            System.out.println(i);
            name = name.toUpperCase();
            counter++;
        }
        int result = counter+2;
        return result;
    }
}

class Main4 {
    public static void main(String[] args) {
        MyPerson person = new MyPerson();
        person.someMethod(4);

    }
}
