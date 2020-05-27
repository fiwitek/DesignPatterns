import Abstract.Pizza;
import Abstract.ToppingDecorator;

public class OliveOil extends ToppingDecorator {

    public OliveOil(Pizza pizzaToDecorate) {
        super(pizzaToDecorate);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", olive oil";
    }
}
