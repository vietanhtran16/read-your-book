package nz.co.stuff.planyourtrip.domain;

import java.time.LocalDate;
import java.util.List;

public class Trip {
    private final long id;
    private final String name;
    private final LocalDate date;
    private final List<Location> locations;

    public Trip() {
        this(0, null, null, null);
    }

    public Trip(long id, String name, LocalDate date, List<Location> locations) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.locations = locations;
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
