package hw_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


// В плані домашнього: щоб не вигадувати всяке різне, просто візьміть приклад з лекції і пройдіться по ВСІХ операціях
//    стріма, бажано по декілька разів.
//    Придумайте щось з ускладнених завдань, працюючи з List<Person>, кожен з об'єктів якого має List<Book>, наприклад:
//
//       1. згенерувати мапу <Person, Integer>, де Integer - кількість сторінок усіх книжок, які має людина
//       2. згенерувати мапу <String, Book>, де String - ім'я людини, Book - книжка з  найбільшою кількістю сторінок
//       3. згенерувати List<Book> відфільтрувавши тільких тих людей, хто старше 25 років і книжки
//       які мають більше 500 сторінок
//
//    Чим більше таких завдань придумаєте, тим більше плюсиків вам у карму.


public class Person {

    private String name;
    private List<Book> books;
    private int age;

    public Person(String name, List<Book> books, int age) {
        this.name = name;
        this.books = books;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Book> getBooks() {
        return books;
    }


    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

}
