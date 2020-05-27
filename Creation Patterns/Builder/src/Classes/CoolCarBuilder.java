package Classes;

import Abstract.CarBuilder;

public class CoolCarBuilder implements CarBuilder {

    private Car car;
    private CoolCarBuilder coolCarBuilder;

    public CoolCarBuilder(){
        this.car=new Car();
    }

    @Override
    public void buildTires() {
        car.setTires("All-season tires");
    }

    @Override
    public void buildEngine() {
        car.setEngine("120hp engine");
    }

    @Override
    public void buildBreaks() {
        car.setBreaks("Drum brakes");
    }

    @Override
    public void buildGearbox() { car.setGearbox("Six speed gearbox"); }

    @Override
    public Car getCar() {
        return this.car;
    }
}
