package pl.pjatk.core;

public class Car {
    private String make;
    private int id;

    public Car(String make, int id) {
        this.make = make;
        this.id = id;
    }

    public Car(String make) {
        this.make = make;
    }

    public Car(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
