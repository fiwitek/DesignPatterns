import Classes.CarEngineer;
import Classes.CoolCarBuilder;

public class Main {

    public static void main(String[] args) {
        CoolCarBuilder coolCarBuilder = new CoolCarBuilder();
        CarEngineer carEngineer = new CarEngineer(coolCarBuilder);
        carEngineer.buildCar();
        System.out.println(carEngineer.getCar().getBreaks());
        System.out.println(carEngineer.getCar().getEngine());
        System.out.println(carEngineer.getCar().getTires());
        System.out.println(carEngineer.getCar().getGearbox());
    }
}
