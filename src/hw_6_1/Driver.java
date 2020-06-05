package hw_6_1;

//     Власник автомобіля теж має бути обєкт, у якого є поля
//        Імя, вік, стаж водіння.

import java.util.Objects;

public class Driver {
    private String name;
    private int age;
    private int experience;

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return age == driver.age &&
                experience == driver.experience &&
                Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, experience);
    }
}
