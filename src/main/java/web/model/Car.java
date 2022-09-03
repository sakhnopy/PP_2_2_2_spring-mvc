package web.model;

public class Car {

    private String engine;
    private int number;
    private String model;

    private Car(){}

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
}