package nz.co.stuff.readyourbook.dto;

public class ReadingProgressRequestDto {
    private Integer percentageCompleted;
    private Long bookId;

    public ReadingProgressRequestDto(){
    }

    public ReadingProgressRequestDto(Integer percentageCompleted, Long bookId){
        this.percentageCompleted = percentageCompleted;
        this.bookId = bookId;
    }

    public Integer getPercentageCompleted(){
        return this.percentageCompleted;
    }

    public Long getBookId(){
        return this.bookId;
    }
}
