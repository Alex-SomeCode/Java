package hw_5;

public class Time {

//    Time:
//        - int min, int hour;
//        -передбачити межі для цих полів (для min 0. .59, для hour 0. .23);

    private int min;
    private int hour;

    public Time(int hour, int min) {
        this.hour = hour >= 0 && hour <= 23 ? hour : this.hour;
        this.min = min >= 0 && min <= 58 ? min : this.min;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {

        int sumMinutes = this.min + min;
        if (sumMinutes >= 59) {

            this.hour = ++this.hour > 23 ? this.hour = 0 : ++this.hour;

            this.min = -59 + sumMinutes;

        } else {
            this.min = sumMinutes;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        int sumHours = this.hour + hour;
        if (sumHours >= 23) {
            this.hour = -23 + sumHours;
        } else {
            this.hour = sumHours;
        }

    }

    @Override
    public String toString() {
        return
                hour + " год. " +
                min + " хв.";
    }
}
