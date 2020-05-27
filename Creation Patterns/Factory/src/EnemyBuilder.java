import Abstract.Enemy;

public class EnemyBuilder {

    public Enemy createBoss(){
        return new Boss();
    }

    public Enemy createSpider(){
        return new Spider();
    }
}
