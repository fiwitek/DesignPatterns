import Abstract.Enemy;

public class Main {

    public static void main(String[] args) {

        EnemyBuilder enemyBuilder = new EnemyBuilder();
        Enemy spider = enemyBuilder.createSpider();
        System.out.println(spider.getName());
        spider = enemyBuilder.createBoss();
        System.out.println(spider.getName());
    }
}
