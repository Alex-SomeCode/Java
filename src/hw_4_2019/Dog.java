package hw_4_2019;

import java.util.Arrays;

public class Dog {
    //        3. Створити клас "Собака"
    //        поля визначити самостійно, але не меньше 6.
    //        За допомоги внутрішнього класу реалізувати паттерн "Builder"

    String name;
    byte age;
    String address;
    String breed;
    double weight;
    String[] skills;

    public static DogBuilder builder (){
        return new DogBuilder();
    }

    public static class DogBuilder {

        private Dog dog = new Dog();

        public DogBuilder setDogName(String name) {
            dog.name = name;
            return this;
        }

        public DogBuilder setDogAge(byte age) {
            dog.age = age;
            return this;
        }

        public DogBuilder setDogBreed(String breed) {
            dog.breed = breed;
            return this;
        }

        public DogBuilder setDogWeight(double weight) {
            dog.weight = weight;
            return this;
        }

        public DogBuilder setDogSkills(String[] skills) {
            dog.skills = skills;
            return this;
        }

        public Dog buildDog (){
            return this.dog;
        }

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
