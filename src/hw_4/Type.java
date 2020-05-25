package hw_4;

public enum Type {
    //  Створити клас Product (назва, ціна, тип (для цього можете створити енум) і ще 1-3 поля за власним бажанням).

    FRUITS("fruits"),
    VEGETABLES("vegetables"),
    HZ ("HZ"),
    NUT ("nut");


    String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type='" + type + '\'' +
                '}';
    }
}
