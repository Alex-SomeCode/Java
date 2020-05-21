package hw_3;

public class Tie extends Clothes implements MenClothes {

    public Tie() {
    }

    String name;

    public Tie(Size size, double price, String color, String name) {
        super(size, price, color);
        this.name = name;
    }


    @Override
    public String toDressMan() {
        return "Привіт, я " + name + " краватка із class Tie який implements MenClothes" +
                " та override toDressMan()!";
    }


    @Override
    public String toString() {
        return "Tie{" +
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
