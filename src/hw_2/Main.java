package hw_2;

public class Main {
    public static void main(String[] args) {
//        а) Определить интерфейс Printable, содержащий метод void print ().
//        б) Определить класс Book, реализующий интерфейс Printable.
//        в) Определить класс Magazine, реализующий интерфейс Printable.
//        г) Создать массив типа Printable, который будет содержать книги и журналы.
//        д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
//        е) Создать статический метод printMagazines (Printable[]printable)в классе Magazine,
//           который выводит на консоль названия только журналов.
//        є) Создать статический метод printBooks (Printable[]printable)в классе
//           Book, который выводит на консоль названия только книг.Используем оператор instanceof.

        Printable[] print = new Printable[5];


        Book book_1 = new Book("Книга 1", "Деякий автор", "Деякий опис");
        print[0] = book_1;

        Book book_2 = new Book("Книга 2", "Деякий автор", "Деякий опис");
        print[1] = book_2;

        Magazine magazine_1 = new Magazine(1, "Мурзілка", "Деякий опис");
        print[2] = magazine_1;

        Magazine magazine_2 = new Magazine(2, "Murzilka next gen", "Some description");
        print[3] = magazine_2;



        for (Printable value : print) {
            if (value == null) {
                return;
            }
            System.out.println(value);
            value.print();
        }

        Magazine.printMagazines(print);
        Book.printBooks(print);


    }

}