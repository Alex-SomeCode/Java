package hw_6_1;

import java.util.Objects;

public class nextUsers {
    private String name;
    private int age;
    private String address;
    private String street;
    private int number;
    private int id;
    private boolean status;

    @Override
    public String toString() {
        return "nextUsers{" + " id: " + id +
                ", name: " + name +
                ", age: " + age +
                ", address: " + address +
                ", street: " + street +
                ", number: " + number +
                ", status: " + status +
                '}';
    }

    public nextUsers(int id, String name, int age, boolean status, String address, String street, int number) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.status = status;
        this.address = address;
        this.street = street;
        this.number = number;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof nextUsers)) return false;
        nextUsers nextUsers = (nextUsers) o;
        return getAge() == nextUsers.getAge() &&
                getNumber() == nextUsers.getNumber() &&
                Objects.equals(getName(), nextUsers.getName()) &&
                Objects.equals(getAddress(), nextUsers.getAddress()) &&
                Objects.equals(getStreet(), nextUsers.getStreet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getAddress(), getStreet(), getNumber());
    }
}


