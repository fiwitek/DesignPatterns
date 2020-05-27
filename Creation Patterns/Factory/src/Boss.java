import Abstract.Enemy;

public class Boss extends Enemy {

    public Boss() {

        this.hp*=2;
        this.damage*=2;
        this.name="Default Boss Name";
    }
}
