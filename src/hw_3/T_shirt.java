package hw_3;

public class T_shirt extends Clothes implements MenClothes, WomenClothes {

// 4. Створити класи нащадки до класу Одяг - Футболка (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг),

    private String name;

    public T_shirt() {
    }

    public T_shirt(String name) {
        this.name = name;
    }

    public T_shirt(Size size, double price, String color, String name) {
        super(size, price, color);
        this.name = name;
    }


    public String toDressMan() {
        return "Привіт, я " + name + " чоловіча футболка із класу T_shit який implements MenClothes, WomenClothes" +
                " та override абстрактний toDressMan() із interface MenClothes!";
    }

    public String toDressWomen() {
        return "Привіт, я " + name + " жіноча футбола із класу T_shit який implements MenClothes, WomenClothes" +
                " та override абстрактний toDressWomen() із interface WomenClothes!";
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "T_shirt{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
