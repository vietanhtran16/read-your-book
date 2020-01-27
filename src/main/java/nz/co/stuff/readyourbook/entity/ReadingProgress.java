package nz.co.stuff.readyourbook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class ReadingProgress {
    public ReadingProgress() {}
    public ReadingProgress(Date timestamp, Integer percentageCompleted, Book book){
        this.timestamp = timestamp;
        this.percentageCompleted = percentageCompleted;
        this.book = book;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date timestamp;

    private Integer percentageCompleted;

    @ManyToOne()
    @JoinColumn()
    private Book book;

    public long getId() { return this.id; }

    public Date getTimestamp() { return this.timestamp; }

    public Integer getPercentageCompleted() { return this.percentageCompleted; }

    public long getBookId() { return this.book.getId(); }
}
