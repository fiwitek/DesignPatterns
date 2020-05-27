package Abstract;

public class CannotFlyType implements Flys {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
