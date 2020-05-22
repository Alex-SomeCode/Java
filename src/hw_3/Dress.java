package hw_3;

public class Dress extends Clothes implements WomenClothes {

    public Dress() {
    }

    public Dress(Size size, double price, String color, String name) {
        super(size, price, color, name);
    }

    @Override
    public String toDressWomen() {

        return "Привіт я " + getName() + " плаття із class Dress який implements WomenClothes" +
                " та override toDressWomen()!";

    }


}
