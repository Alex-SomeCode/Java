package hw_5;

import java.util.TreeSet;

public class Schedule {

//    Schedule:
//        -TreeSet < Seance > (в полі пишемо Set<Seance>,а в конструкторі вже = new TreeSet<Seance>() );
//        -Сортування по startTime.
//        -методи:addSeance(Seance), removeSeance(Seance);

    private TreeSet<Seance> seances;

    public Schedule() {
        this.seances = new TreeSet<>();
    }

    public TreeSet<Seance> getSeances() {
        return seances;
    }

    // -методи:addSeance(Seance), removeSeance(Seance);

    public void addSeance(Seance seance) {
        this.seances.add(seance);
    }

    public void removeSeance(Seance seance) {
        this.seances.remove(seance);

    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();

        for (Seance seance : seances) {
            text.append(("Назва фільму: "))
                    .append(seance.getMovie().getTitle()).append(". ")
                    .append('\n')
                    .append("\t")
                    .append("Сеанс розпочинається о ")
                    .append(seance.getStatTime().getHour()).append(" год. ")
                    .append(seance.getStatTime()
                            .getMin())
                    .append(" хв.").append('\n');


        }

        return text.toString();
    }
}
