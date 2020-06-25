package hw_6_1;

import java.util.Objects;

public class Car {

    private String producer;
    private String model;
    private int year;
    private String color;
    private String type;
    private String engine;
    private double volume;
    private int power;

    public Car(String producer, String model, int year, String color, String type, String engine, double     volume, int power) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.type = type;
        this.engine = engine;
        this.volume = volume;
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

//    @Override
//    public String toString() {
//        return "Cars{" +
//                "producer='" + producer + '\'' +
//                ", model='" + model + '\'' +
//                ", year=" + year +
//                ", color='" + color + '\'' +
//                ", type='" + type + '\'' +
//                ", engine='" + engine + '\'' +
//                ", volume=" + volume +
//                ", power=" + power +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getYear() == car.getYear() &&
                getVolume() == car.getVolume() &&
                getPower() == car.getPower() &&
                Objects.equals(getProducer(), car.getProducer()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor()) &&
                Objects.equals(getType(), car.getType()) &&
                Objects.equals(getEngine(), car.getEngine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducer(), getModel(), getYear(), getColor(), getType(), getEngine(), getVolume(), getPower());
    }


}
// producer:
//            "subaru", model:"wrx", year:2010, color:"blue", type:"sedan", engine:"ej204x", volume:2, power:400