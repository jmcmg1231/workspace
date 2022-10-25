public class MyPizzaHouse {

    public void makePizza() {
        prepare();
        addToppings();
        bake();
    }

    private static void prepare() {
        System.out.println("How do you want your pizza prepared? ");
    }

    private static void addToppings() {
        System.out.println("What toppings do you want?");
    }

    private static void bake() {
        System.out.println("Bake on high");
    }

}
