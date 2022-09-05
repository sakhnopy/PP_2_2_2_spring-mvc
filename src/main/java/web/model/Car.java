package web.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Car {

    private String engine;
    private int number;
    private String model;

    public Car(){}

    public Car(String engine, int number, String model) {
        this.engine = engine;
        this.number = number;
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car createCar(String engine, int number, String model) {
        return new Car(engine, number, model);
    }
}
