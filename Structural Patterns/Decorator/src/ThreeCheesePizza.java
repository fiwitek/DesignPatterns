import Abstract.Pizza;
import Abstract.ToppingDecorator;

public class ThreeCheesePizza extends ToppingDecorator {

    public ThreeCheesePizza(Pizza pizzaToDecorate){
        super(pizzaToDecorate);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+5.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", mozzarella, blue cheese, parmigiano";
    }
}
