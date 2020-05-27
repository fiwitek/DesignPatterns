import Abstract.Animal;

public class Main {

    public static void main(String[] args) {

		Animal animal = new Dog("Dog");
			animal.giveVoice();
			animal.tryToFly();
	    animal = new Bird("Parrot");
			animal.giveVoice();
			animal.tryToFly();
    }
}
