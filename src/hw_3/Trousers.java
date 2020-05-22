package hw_3;

public class Trousers extends Clothes implements MenClothes, WomenClothes {


    public Trousers() {
    }

    public Trousers(Size size, double price, String color, String name) {
        super(size, price, color, name);
    }

    public String toDressMan() {

        return "Привіт, ми " + getName() + " чоловічі штани із class Trousers який implements MenClothes, WomenClothes та " +
                "override toDressMan() із interface MenClothes!";

    }

    public String toDressWomen() {

        return "Привіт, ми " + getName() + " жіночі штани із class Trousers який implements MenClothes, WomenClothes! та " +
                "override toDressWomen() із interface WomenClothes!";

    }

}
