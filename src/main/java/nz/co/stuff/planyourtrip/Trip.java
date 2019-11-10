package nz.co.stuff.planyourtrip;

import java.time.LocalDate;

public class Trip {
    private final long id;
    private final String name;
    private final LocalDate date;

    public Trip() {
        this(0, null, null);
    }

    public Trip(long id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Trip{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", date=" + date +
            '}';
    }
}
