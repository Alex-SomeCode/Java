package hw_6;

public class Book implements Comparable<Book> {


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



    String name;
    String country;
    int pages;

    public Book(String name, String country, int pages) {
        this.name = name;
        this.country = country;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public int compareTo(Book o) {
        int comparableByName, comparableByCountry, comparableByPages;

        comparableByCountry = this.country.compareTo(o.country);
        comparableByPages = this.pages - o.pages;
        comparableByName = this.name.compareTo(o.name);

        if (comparableByCountry == 0) {
            if (comparableByPages == 0) {
                if (comparableByName == 0) {
                    return comparableByName;
                }
            }
            return comparableByPages;
        } return comparableByCountry;


    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", pages=" + pages +
                '}';
    }
}
