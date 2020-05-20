package hw_2;

public class Magazine implements Printable {
    int id;
    String name;
    String description;

    public Magazine(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Magazine() {
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }


    public void print() {
        System.out.printf("Журнал №%d\nНазва: %s; \nОпис: %s;\n--------------------------------------\n",
                id, name, description);
    }
//      е) Создать статический метод printMagazines (Printable[]printable)в классе Magazine,
//      который выводит на консоль названия только журналов.
//      Используем оператор instanceof.

    static void printMagazines(Printable[] printable) {
        for (Printable value : printable) {
            if (value instanceof Magazine) System.out.println(value + ";\n------------------------");
        }
    }

}
