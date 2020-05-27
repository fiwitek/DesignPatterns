import Abstract.Pizza;

public class BasePizza implements Pizza {
    @Override
    public double getPrice() {
        return 15.90;
    }

    @Override
    public String getDescription() {
        return "Thin dough, tomato sauce";
    }
}
