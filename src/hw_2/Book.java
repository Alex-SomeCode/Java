package hw_2;

public class Book implements Printable {

    String name;
    String author;
    String description;

    public Book() {
    }

    public Book(String name, String author, String description) {
//      є) Создать статический метод printBooks (Printable[]printable)в классе
//      Book, который выводит на консоль названия только книг.Используем оператор instanceof.

        this.name = name;
        this.author = author;
        this.description = description;
    }

    static void printBooks(Printable[] print) {
        for (Printable valueOfArray : print) {
            if (valueOfArray instanceof Book) System.out.println(valueOfArray + "; \n------------------------");

        }
    }

    @Override
    public void print() {
        System.out.printf("Назва: %s;\nАвтор: %s;\nОпис: %s;\n--------------------------------------\n",
                name, author, description);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
