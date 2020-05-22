package hw_3;

public class T_shirt extends Clothes implements MenClothes, WomenClothes {

// 4. Створити класи нащадки до класу Одяг - Футболка (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг),

    public T_shirt(Size size, double price, String color, String name) {
        super(size, price, color, name);
    }


    @Override
    public String toDressMan() {
        return "Привіт, я " + getName() + " чоловіча футболка із класу T_shit який implements MenClothes, WomenClothes" +
                " та override абстрактний toDressMan() із interface MenClothes!";
    }

    @Override
    public String toDressWomen() {
        return "Привіт, я " + getName() + " жіноча футбола із класу T_shit який implements MenClothes, WomenClothes" +
                " та override абстрактний toDressWomen() із interface WomenClothes!";
    }


}
