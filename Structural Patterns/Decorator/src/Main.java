import Abstract.Pizza;

public class Main {

    public static void main(String[] args) {

        Pizza basePizza = new OliveOil(new ThreeCheesePizza(new BasePizza()));
        System.out.println(basePizza.getDescription());
    }
}
