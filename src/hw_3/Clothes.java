package hw_3;
// 3. Створити абстрактний клас Одяг, який має такі поля: розмір одягу (використати створений енум), вартість, колір.

public abstract class Clothes {
    private Size size;
    private double price;
    private String color;
    private String name;

    public Clothes() {
    }


    public Clothes(Size size, double price, String color, String name) {
        this.size = size;
        this.price = price;
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", якщо простіше, то " +
                size.getDescription() +
                ", а самі цифри цього " +
                size + " - " +
                size.getEuroSize() +
                "см , price=" + price +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
