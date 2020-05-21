package hw_3;

public class Trousers extends Clothes implements MenClothes, WomenClothes {

    String name;

    public Trousers() {
    }

    public Trousers(Size size, double price, String color, String name) {
        super(size, price, color);
        this.name = name;
    }

    public String toDressMan() {

        return "Привіт, ми " + name + " чоловічі штани із class Trousers який implements MenClothes, WomenClothes та " +
                "override toDressMan() із interface MenClothes!";

    }

    public String toDressWomen() {

        return "Привіт, ми " + name + " жіночі штани із class Trousers який implements MenClothes, WomenClothes! та " +
                "override toDressWomen() із interface WomenClothes!";

    }


    @Override
    public String toString() {
        return "Trousers{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
