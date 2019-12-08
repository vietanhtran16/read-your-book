package nz.co.stuff.planyourtrip.dto;

import java.util.Date;

public class ReadingProgressDto {
    private final long bookId;
    private final double readingPercentage;
    private final Date dateOfRecord;

    public ReadingProgressDto(long bookId, double readingPercentage, Date dateOfRecord){
        this.bookId = bookId;
        this.readingPercentage = readingPercentage;
        this.dateOfRecord = dateOfRecord;
    }

    public long getBookId(){
        return this.bookId;
    }

    public double getReadingPercentage(){
        return this.readingPercentage;
    }

    public Date getDateOfRecord(){
        return this.dateOfRecord;
    }
}