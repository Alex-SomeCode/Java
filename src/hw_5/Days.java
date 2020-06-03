package hw_5;

public enum Days implements Comparable <Days> {

//    enum Days:
//        -прописати дні тижня;


    MONDAY("monday"), TUESDAY("tuesday"), WEDNESDAY("wednesday"), THURSDAY("thursday"),
    FRIDAY("friday"), SATURDAY("saturday"), SUNDAY("sunday");

    private String day;

    public String getDay() {
        return day;
    }

    Days(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return " " + this.name()+ " ";
    }
}
