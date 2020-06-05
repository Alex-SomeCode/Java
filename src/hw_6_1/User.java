package hw_6_1;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private boolean status;
    private int id;


    public User(String name, int age, boolean status) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.id = 0;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return
               "id: "+ id + " name: " + name + "; age: " + age + " status: " + status + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() &&
                isStatus() == user.isStatus() &&
                Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), isStatus());
    }


}
