package hw_5;

import java.util.*;

public class Cinema {

//    Cinema:
//        -TreeMap < Days, Schedule >, Time open, Time close;
//
//        -врахувати час відкриття і закриття при формуванні сеансів !
//                -методи:
//                  addSeances(String day, Seance...seance)(додає набір сеансів в конкретний день),
//                  addSeance(Seance, String) (додає один сеанс в конкретний день),
//                  removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу),
//                  removeSeance(Seance, String) (видаляє конкретний сеанс фільму в конкретний день,
//                      який задається параметром String).

    private Time open;
    private Time close;
    private TreeMap<Days, Schedule> schedulesOnDays;

    public Cinema(Time open, Time close, TreeMap<Days, Schedule> schedulesOnDays) {

        this.open = open;
        this.close = close;
        this.schedulesOnDays = schedulesOnDays;

        Set<Map.Entry<Days, Schedule>> entrySet = schedulesOnDays.entrySet();

        for (Map.Entry<Days, Schedule> scheduleEntry : entrySet) {
            TreeSet<Seance> seances = scheduleEntry.getValue().getSeances();
            for (Seance seance : seances) {

                if (open.getHour() < seance.getStatTime().getHour() ||
                        open.getHour() == seance.getStatTime().getHour() &&
                                open.getMin() < seance.getStatTime().getMin()) {
                    System.out.println("ОК! Кінотеатр відкривається раніше, ніж розпичинається сеанс.");
                } else {
                    System.out.println("Помилка! Сеанс розпочинається раніше, ніж працівнкики кінотеатру " +
                            "приїодять на роботу.");
                }

                if (close.getHour() > seance.getEndTime().getHour() ||
                        close.getHour() == seance.getEndTime().getHour()
                                && close.getMin() > seance.getEndTime().getMin()) {
                    System.out.println("ОК! Кінотеатр зачиняється після закінчення сенансу.");
                } else {
                    System.out.println("Помилка! Сеанс закінчується після закриття кінотеатру. ");
                }
            }
        }

    }


    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    public void addSeances(String day, Seance... seances) {
        Days[] days = Days.values();
        boolean marker = false;
        Days dayValue;

        for (Days element : days) {
            if (day.equals(element.name())) {
                dayValue = element;
                marker = true;
                for (Seance seance : seances) {
                    schedulesOnDays.get(dayValue).addSeance(seance);
                }
            }
        }
        if (!marker) System.out.println("Your input day - " + day + " is not found.");


    }


    public void addSeance(String day, Seance seance) {
        Days[] days = Days.values();
        Days dayValue;
        boolean marker = false;

        for (Days element : days) {
            if (day.equals(element.name())) {
                dayValue = element;
                marker = true;
                schedulesOnDays.get(dayValue).addSeance(seance);
            }
        }
        if (!marker) System.out.println("Your input day - " + day + " is not found.");


    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        Set<Map.Entry<Days, Schedule>> map = schedulesOnDays.entrySet();
        for (Map.Entry<Days, Schedule> currentElement : map) {
            text.append("Супер кінотеатр в ")
                    .append(currentElement.getKey().name())
                    .append('\n').append('\t')
                    .append(" працює: ")
                    .append("з ").append(this.open.getHour())
                    .append(" год. ").append(this.open.getMin())
                    .append(" хв. ")
                    .append('\n').append('\t')
                    .append("закінчує роботу: ")
                    .append(this.close.getHour()).append(" год ").append(this.close.getMin()).append(" хв.")
                    .append('\n')
                    .append("На цей день доступні сеанси:")
                    .append('\n').append('\t');
            int i = 0;
            for (Seance seance : currentElement.getValue().getSeances()) {
                text
                        .append(++i)
                        .append(") ").append(seance.movie.getTitle())
                        .append(" - ").append("розпочинається о: ").append(seance.getStatTime().getHour())
                        .append(" год. ").append(seance.getStatTime().getMin()).append(" хв.")
                        .append('\n').append('\t').append('\t').append('\t')
                        .append("закінчується о: ").append(seance.getEndTime().getHour())
                        .append(" год. ").append(seance.getEndTime().getMin()).append(" хв.")
                        .append('\n').append('\t');
            }
        }
        return text.toString();
    }

    // removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу),

    public void removeMovie(Movie movie) {

        Set<Map.Entry<Days, Schedule>> entryOfSchedulesOnDays = schedulesOnDays.entrySet();
        Iterator<Map.Entry<Days, Schedule>> iterator = entryOfSchedulesOnDays.iterator();

        boolean marker = false;

        while (iterator.hasNext()) {
            Map.Entry<Days, Schedule> currentElement = iterator.next();
            Schedule schedule = currentElement.getValue();

            TreeSet<Seance> seance = schedule.getSeances();
            Iterator<Seance> seanceIterator = seance.iterator();

            while (seanceIterator.hasNext()) {
                Seance seanceElement = seanceIterator.next();

                if (seanceElement.movie.equals(movie)) {
                    marker = true;
                    seanceIterator.remove();
                }

            }
        }
        if (!marker) System.out.println("Your input movie is not found" + "\n");
    }

    public void removeSeance(Seance seance, String day) {
        Set<Map.Entry<Days, Schedule>> entryOfSchedulesOnDays = schedulesOnDays.entrySet();
        Iterator<Map.Entry<Days, Schedule>> iterator = entryOfSchedulesOnDays.iterator();

        Days dayValue = null;
        Days[] days = Days.values();

        for (Days element : days) {
            if (element.name().equals(day)) {
                System.out.println(element.name());
                dayValue = element;
            }
        }

        while (iterator.hasNext()) {
            Map.Entry<Days, Schedule> currentElement = iterator.next();
            if (currentElement.getKey().equals(dayValue)) {
                currentElement.getValue().removeSeance(seance);
            }
        }


    }


}
