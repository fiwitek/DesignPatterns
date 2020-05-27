public class Main {

    public static void main(String[] args) {

        CloneFactory cloneFactory = new CloneFactory();
        Sheep shaun = new Sheep("Shaun");
        Sheep clonedSheep;
        clonedSheep = (Sheep)cloneFactory.getClone(shaun);

        System.out.println(shaun+" "+shaun.getName());
        System.out.println(clonedSheep+" "+clonedSheep.getName());
    }
}
