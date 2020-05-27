package Classes;

import Abstract.CarBuilder;

public class CarEngineer {

    private CarBuilder carBuilder;

    public CarEngineer(CarBuilder carBuilder){
        this.carBuilder=carBuilder;
    }

    public Car getCar() {
        return carBuilder.getCar();
    }

    public void buildCar() {

        this.carBuilder.buildBreaks();
        this.carBuilder.buildEngine();
        this.carBuilder.buildTires();
        this.carBuilder.buildGearbox();
    }
}
