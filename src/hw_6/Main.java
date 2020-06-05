package hw_6;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Kobzar", "Ukraine", 400);
        Book book2 = new Book("Animals", "USA", 200);
        Book book3 = new Book("History of the world", "Ukraine", 600);
        Book book4 = new Book("Java", "USA", 600);
        Book book5 = new Book("JS", "Ukraine", 300);
        Book book6 = new Book("HTML", "Ukraine", 200);
        Book book7 = new Book("Java Pattern", "Ukraine", 400);
        Book book8 = new Book("C++", "Ukraine", 500);


        List<Book> books1 = Arrays.asList(book1, book2);

        books1.forEach(book -> System.out.println(book));

        Person person1 = new Person("Chpok", Arrays.asList(book1, book2), 24);
        Person person2 = new Person("Poopok", Arrays.asList(book3, book4), 26);
        Person person3 = new Person("Chakchi", Arrays.asList(book5, book6), 28);
        Person person4 = new Person("Tiki", Arrays.asList(book7, book8), 27);

//       1. згенерувати мапу <Person, Integer>, де Integer - кількість сторінок усіх книжок, які має людина

        List<Person> persons = Arrays.asList(person1, person2, person3, person4);

        // Function.identity()
        Map<Person, Integer> collect1 = persons.stream().collect(Collectors.toMap(person -> person,
                person -> {
                    int countPages = 0;
                    for (Book element : person.getBooks()) {
                        countPages += element.getPages();
                    }
                    return countPages;
                }));


        for (Map.Entry<Person, Integer> tt : collect1.entrySet()) {
            System.out.println(tt);
        }

//       2. згенерувати мапу <String, Book>, де String - ім'я людини, Book - книжка з  найбільшою кількістю сторінок

        Map<String, Book> collect2 = persons.stream().collect(Collectors.toMap(
                /* Person::getName */
                person -> person.getName(), person -> {
                    person.getBooks().sort((o1, o2) -> o2.getPages() - o1.getPages());
                    return person.getBooks().stream().findFirst().get();
                }));


        Map<Person, Book> collect2_2 = persons.stream().collect(Collectors.toMap(new Function<Person, Person>() {
            @Override
            public Person apply(Person person) {
                return person;
            }
        }, person -> {

            // створили об'єкт/екземпляр типу/класу функціонального інтерфейсу Comparator, який
            // параметризований типом/класом Book, за допмогою анонімного класу
            // в якому перевизначили абстрактний метод COMPARE таким чином,
            // завдяки ---  ( o2 - o1 )  ---, що колекція сортується від найбільшого
            // до найменшого екземпляру типу Book, у даному випадку за значенням кількості сторінок.

            person.getBooks().sort(new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o2.getPages() - o1.getPages();
                }
            });
            return person.getBooks().stream().findFirst().get();
        }));

        System.out.println("__________________");
        for (Map.Entry<Person, Book> entry : collect2_2.entrySet()) {
            System.out.println(entry);
        }


//        3. згенерувати List<Book> відфільтрувавши тільких тих людей, хто старше 25 років і книжки
//        які мають більше 500 сторінок
//        persons.stream().collect(Collectors.toMap(
//                person -> person.getName(), person -> {

        List<Book> collect = persons.stream().filter(person -> person.getAge() > 25)
                .map(person -> person.getBooks())
                .flatMap(Collection::stream)
                .filter(book -> book.getPages() > 500)
                .collect(Collectors.toList());

        Iterator<Book> iterator = collect.iterator();

        System.out.println("_________________ > 25; > 500");
        collect.forEach(book -> System.out.println(book));


    } //main
} // Main


