import Abstract.Animal;
import Abstract.CannotFlyType;

public class Dog extends Animal {

    public Dog(String name) {
        this.name=name;
        this.flysType=new CannotFlyType();
    }

    @Override
    public void giveVoice() {
        System.out.println("Wow");
    }

    @Override
    public void tryToFly() {
        flysType.fly();
    }
}
