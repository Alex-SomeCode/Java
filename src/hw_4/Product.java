package hw_4;

public class Product {
    //  Створити клас Product (назва, ціна, тип (для цього можете створити енум) і ще 1-3 поля за власним бажанням).

    private int productCode = 30;
    private String name;
    private double price;
    private Type type;
    private String maker;
    private int makerCode;

    public Product() {
    }

    public Product(int productCode, String name, double price, Type type, String maker, int makerCode) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.type = type;
        this.maker = maker;
        this.makerCode = makerCode;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getMakerCode() {
        return makerCode;
    }

    public void setMakerCode(int makerCode) {
        this.makerCode = makerCode;
    }

    @Override
    public String toString() {
        return "Код продукту: " + productCode +
                ", назва: " + '\"' + name + '\"' +
                ", ціна: " + price +
                ", тип: " + type.name() +
                ", виробник: " + maker + '\'' +
                ", код виробника: " + makerCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (productCode != product.productCode) return false;
        if (Double.compare(product.getPrice(), getPrice()) != 0) return false;
        if (makerCode != product.makerCode) return false;
        if (!getName().equals(product.getName())) return false;
        if (getType() != product.getType()) return false;
        return maker.equals(product.maker);
    }


    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productCode;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (maker != null ? maker.hashCode() : 0);
        result = 31 * result + makerCode;
        return result;
    }
}
