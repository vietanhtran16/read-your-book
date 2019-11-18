package nz.co.stuff.planyourtrip.domain;

import java.time.LocalDate;

public class Location {
    private final String name;
    private final int timeToSpendInSeconds;
    private final LocalDate date;

    public Location(String name, int timeToSpendInSeconds, LocalDate date){
        this.name = name;
        this.timeToSpendInSeconds = timeToSpendInSeconds;
        this.date = date;
    }

    public String getName(){
        return this.name;
    }

    public int getTimeToSpendInSeconds(){
        return this.timeToSpendInSeconds;
    }

    public LocalDate getDate(){
        return this.date;
    }
}
