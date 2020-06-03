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

    public Cinema(Time open, Time close, TreeMap<Days, Schedule> cinemaSchedule) {

        this.open = open;
        this.close = close;
        this.schedulesOnDays = validateSchedule(cinemaSchedule);

//   Наступні рядки коду більш правильно винести в окремий метод, наприклад private void validateSchedule(...),
//   Так набагато зручніше читати
//   По коду виходить так, що навіть якщо сеанс не входить в рамки графіку кінотеатру,
//   він все одно залишається в розкладі. Було б добре його видаляти
//
//         for (Map.Entry<Days, Schedule> scheduleEntry : entrySet) {
//            TreeSet<Seance> seances = scheduleEntry.getValue().getSeances();
//            for (Seance seance : seances) {
//
//                if (open.getHour() < seance.getStatTime().getHour() ||
//                        open.getHour() == seance.getStatTime().getHour() &&
//                                open.getMin() < seance.getStatTime().getMin()) {
//                    System.out.println("ОК! Кінотеатр відкривається раніше, ніж розпичинається сеанс.");
//                } else {
//                    System.out.println("Помилка! Сеанс розпочинається раніше, ніж працівнкики кінотеатру " +
//                            "приїодять на роботу.");
//                }
//
//                if (close.getHour() > seance.getEndTime().getHour() ||
//                        close.getHour() == seance.getEndTime().getHour()
//                                && close.getMin() > seance.getEndTime().getMin()) {
//                    System.out.println("ОК! Кінотеатр зачиняється після закінчення сенансу.");
//                } else {
//                    System.out.println("Помилка! Сеанс закінчується після закриття кінотеатру. ");
//                }
//            }
//        }

    }

    private TreeMap<Days, Schedule> validateSchedule(TreeMap<Days, Schedule> value) {

        Set<Map.Entry<Days, Schedule>> entrySet = value.entrySet();
        TreeMap<Days, Schedule> stv1 = new TreeMap<>();
        Schedule stv2 = new Schedule();


        for (Map.Entry<Days, Schedule> scheduleEntry : entrySet) {
            TreeSet<Seance> seances = scheduleEntry.getValue().getSeances();

            boolean marker;

            for (Seance seance : seances) {

                if (open.getHour() < seance.getStatTime().getHour() ||
                        open.getHour() == seance.getStatTime().getHour() &&
                                open.getMin() < seance.getStatTime().getMin()) {

                    System.out.println("ОК! Кінотеатр відкривається раніше, ніж розпочинається сеанс " +
                            "кінцо " + seance.getMovie().getTitle());
                    marker = true;
                    stv2.addSeance(seance);
                    stv1.put(scheduleEntry.getKey(), stv2);

                } else {
                    System.out.println("Помилка! Сеанс на кінцо " + seance.getMovie().getTitle()
                            + " розпочинається раніше, ніж працівнкики кінотеатру " +
                            "приходять на роботу.");
                    marker = false;
                }

                if (close.getHour() > seance.getEndTime().getHour() ||
                        close.getHour() == seance.getEndTime().getHour()
                                && close.getMin() > seance.getEndTime().getMin()) {
                    if (!marker) {
                        System.out.println("НЕ ОК! Кінотеатр зачиняється після закінчення сенансу, БО КІНЦО РОЗПОЧАЛОСЬ ДО ВІДКРИТЯ "
                                + "КІНТОЕАТРУ");
                    }else {
                        System.out.println("ОК! Кінотеатр зачиняється після закінчення сенансу");

                    }
                } else {
                    System.out.println("Помилка! Сеанс закінчується після закриття кінотеатру. ");
                }
            }
        }
        return stv1;
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

//        Days[] days = Days.values();
//        boolean marker = false;
//        Days dayValue;
//
//        for (Days element : days) {
//            if (day.equals(element.name())) {
//                dayValue = element;
//                marker = true;
//                for (Seance seance : seances) {
//                    schedulesOnDays.get(dayValue).addSeance(seance);
//                }
//            }
//        }
//        if (!marker) System.out.println("Your input day - " + day + " is not found.");

        try {
            Days dayValue = Days.valueOf(day);
            for (Seance seance : seances) {
                schedulesOnDays.get(dayValue).addSeance(seance);
            }
        } catch (Exception e) {
            System.out.println("НЕМА ТАКОГО ДНЯ! Додати надані сеани неможливо.");
        }


    }


    public void addSeance(String day, Seance seance) {

//        Days[] days = Days.values();
//        Days dayValue;
//        boolean marker = false;
//
//        for (Days element : days) {
//            if (day.equals(element.name())) {
//                dayValue = element;
//                marker = true;
//                schedulesOnDays.get(dayValue).addSeance(seance);
//            }
//        }
//        if (!marker) System.out.println("Your input day - " + day + " is not found.");


        try {
            Days dayValue = Days.valueOf(day);
            schedulesOnDays.get(dayValue).addSeance(seance);
        } catch (Exception e) {
            System.out.println("НЕМА ТАКОГО ДНЯ! Дадати наданий сеанс неможливо.");
        }

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
                        .append(") ").append(seance.getMovie().getTitle())
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

                if (seanceElement.getMovie().equals(movie)) {
                    marker = true;
                    seanceIterator.remove();
                }

            }
        }
        if (!marker) System.out.println("Your input movie is not found" + "\n");
    }

    public void removeSeance(Seance seance, String day) {

//        Set<Map.Entry<Days, Schedule>> entryOfSchedulesOnDays = schedulesOnDays.entrySet();
//        Iterator<Map.Entry<Days, Schedule>> iterator = entryOfSchedulesOnDays.iterator();
//
//        Days dayValue = null;
//        Days[] days = Days.values();
//
//        for (Days element : days) {
//            if (element.name().equals(day)) {
//                System.out.println(element.name());
//                dayValue = element;
//            }
//        }


        Set<Map.Entry<Days, Schedule>> entryOfSchedulesOnDays = schedulesOnDays.entrySet();
        Iterator<Map.Entry<Days, Schedule>> iterator = entryOfSchedulesOnDays.iterator();

        try {
            Days dayValue = Days.valueOf(day);
            while (iterator.hasNext()) {
                Map.Entry<Days, Schedule> currentElement = iterator.next();
                if (currentElement.getKey().equals(dayValue)) {
                    currentElement.getValue().removeSeance(seance);
                }
            }
        } catch (Exception e) {
            System.out.println("Немає такого дня.");
        }


    }


}
