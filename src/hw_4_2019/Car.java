package hw_4_2019;

import java.util.Arrays;

public class Car {

    //        2. Створити клас "Авто"
    //        поля
    //        модель, Двигун, Колеса[],ід, потужність
    //        За допомоги внутрішнього класу реалізувати паттерн "Builder"

    private String model;
    private double engine;
    private String[] wheels;
    private int power;

    static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
       private Car car = new Car();


        public CarBuilder setModel(String model) {
            car.model = model;
            return this;
        }

        public CarBuilder setEngine(double engine) {
            car.engine = engine;
            return this;
        }

        public CarBuilder setWheels(String[] wheels) {
            car.wheels = wheels;
            return this;
        }

        public CarBuilder setPower(int power) {
            car.power = power;
            return this;
        }

        public Car buildCar() {
            return this.car;
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                ", power=" + power +
                '}';
    }
}
