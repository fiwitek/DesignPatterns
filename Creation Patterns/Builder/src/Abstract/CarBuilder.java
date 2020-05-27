package Abstract;
import Classes.Car;

public interface CarBuilder {

    void buildTires();
    void buildEngine();
    void buildBreaks();
    void buildGearbox();
    Car getCar();
}
