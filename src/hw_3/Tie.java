package hw_3;

public class Tie extends Clothes implements MenClothes {

    public Tie() {
    }

    public Tie(Size size, double price, String color, String name) {
        super(size, price, color, name);
    }

    @Override
    public String toDressMan() {
        return "Привіт, я " + getName() + " краватка із class Tie який implements MenClothes" +
                " та override toDressMan()!";
    }


}


