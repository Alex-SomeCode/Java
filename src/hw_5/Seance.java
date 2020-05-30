package hw_5;

import java.util.Objects;

public class Seance implements Comparable<Seance> {

//        Seance:
//        -Movie movie, Time startTime, Time endTime;
//        -в конструктор має надходити параметрами значення для перших двох полів, третє поле повинне
//        обчислюватись(start + duration);

    Movie movie;
    Time statTime;
    Time endTime;

    public Seance(Movie movie, Time statTime) {
        this.movie = movie;
        this.statTime = statTime;


//        this.endTime.setHour(statTime.getHour() + movie.getDuration().getHour());
//        this.endTime.setMin(statTime.getMin() + movie.getDuration().getMin());


        this.endTime = new Time(this.statTime.getHour() + this.movie.getDuration().getHour(),
                this.statTime.getMin() + this.movie.getDuration().getMin());

    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStatTime() {
        return statTime;
    }

    public void setStatTime(Time statTime) {
        this.statTime = statTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "сеанс на фільм "
                + movie.getTitle() +
                 " Початок сеансу: " + '\n'+
                + statTime.getHour() + " хв. " + getStatTime().getMin() + " хв. кінець сеансу: "
                + endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seance)) return false;
        Seance seance = (Seance) o;
        return Objects.equals(getMovie(), seance.getMovie()) &&
                Objects.equals(getStatTime(), seance.getStatTime()) &&
                Objects.equals(getEndTime(), seance.getEndTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovie(), getStatTime(), getEndTime());
    }

    //        -Сортування по startTime.
    @Override
    public int compareTo(Seance o) {

        int compareByStartTime, compareByEndTime, compareByName;

        compareByStartTime =
                (this.statTime.getHour() + this.statTime.getMin()) - (o.statTime.getHour() + o.statTime.getMin());

        if (compareByStartTime == 0) {
            compareByEndTime = (this.endTime.getHour() + this.endTime.getMin()) -
                    (o.getEndTime().getHour() + o.getEndTime().getMin());
            if (compareByEndTime == 0) {
                compareByName = this.movie.getTitle().compareTo(o.movie.getTitle());
                return compareByName;
            }
            return compareByEndTime;
        }
        return compareByStartTime;

    }

}
