import Abstract.Animal;

public class Sheep implements Animal {

    private String name;
    public Sheep(String name) {
        System.out.println("Sheep created");
        this.name=name;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public Animal makeCopy() {

        Sheep sheep = null;

        try {
            sheep = (Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheep;
    }
}
