package Classes;

import Abstract.CarPlan;

public class Car implements CarPlan {

    private String tires;
    private String engine;
    private String breaks;
    private String gearbox;

    @Override
    public String getTires() {
        return tires;
    }
    @Override
    public String getEngine() {
        return engine;
    }
    @Override
    public String getBreaks() {
        return breaks;
    }
    @Override
    public String getGearbox() {
        return gearbox;
    }

    @Override
    public void setTires(String tires) {
        this.tires=tires;
    }

    @Override
    public void setEngine(String engine) {
        this.engine=engine;
    }

    @Override
    public void setBreaks(String breaks) {
        this.breaks=breaks;
    }

    @Override
    public void setGearbox(String gearbox) {
        this.gearbox=gearbox;
    }
}
