package hw_6_1;
//        Створити обєкт автомобіля з полями:
//        Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//                Власник автомобіля теж має бути обєкт, у якого є поля
//        Імя, вік, стаж водіння.


import java.util.Objects;

public class NextCar {
    private String brand;
    private int power;
    private Driver driver;
    private int price;
    private int yearOfProduction;

    public NextCar(String brand, int power, Driver driver, int price, int yearOfProduction) {
        this.brand = brand;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "nextCar{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", driver=" + driver +
                ", price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NextCar)) return false;
        NextCar nextCar = (NextCar) o;
        return getPower() == nextCar.getPower() &&
                getPrice() == nextCar.getPrice() &&
                getYearOfProduction() == nextCar.getYearOfProduction() &&
                Objects.equals(getBrand(), nextCar.getBrand()) &&
                Objects.equals(getDriver(), nextCar.getDriver());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getPower(), getDriver(), getPrice(), getYearOfProduction());
    }


}
