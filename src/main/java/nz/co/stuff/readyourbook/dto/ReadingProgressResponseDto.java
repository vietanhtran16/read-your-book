package nz.co.stuff.readyourbook.dto;

import java.util.Date;

public class ReadingProgressResponseDto {
    private final long readingProgressId;
    private final long bookId;
    private final double readingPercentage;
    private final Date timestamp;

    public ReadingProgressResponseDto(long readingProgressId, long bookId, double readingPercentage, Date timestamp){
        this.readingProgressId = readingProgressId;
        this.bookId = bookId;
        this.readingPercentage = readingPercentage;
        this.timestamp = timestamp;
    }

    public long getReadingProgressId() { return this.readingProgressId; }

    public long getBookId(){
        return this.bookId;
    }

    public double getReadingPercentage(){
        return this.readingPercentage;
    }

    public Date getTimestamp(){
        return this.timestamp;
    }
}
