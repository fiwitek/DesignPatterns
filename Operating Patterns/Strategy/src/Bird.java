import Abstract.Animal;
import Abstract.CanFlyType;

public class Bird extends Animal {

    public Bird(String name) {
        this.name=name;
        this.flysType=new CanFlyType();
    }

    @Override
    public void giveVoice() {
        System.out.println("I'm parrot. I can talk");
    }

    @Override
    public void tryToFly() {
        flysType.fly();
    }
}
