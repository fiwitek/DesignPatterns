package Abstract;

public class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza pizzaToDecorate) {
        this.tempPizza=pizzaToDecorate;
    }
    @Override
    public double getPrice() {
        return tempPizza.getPrice();
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }
}
