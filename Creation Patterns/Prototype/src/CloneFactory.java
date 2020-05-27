import Abstract.Animal;

public class CloneFactory {

    public Animal getClone(Animal animalPrototype) {

        return animalPrototype.makeCopy();
    }
}
