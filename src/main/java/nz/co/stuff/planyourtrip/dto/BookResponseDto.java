package nz.co.stuff.planyourtrip.dto;

public class BookResponseDto {
    private final long id;
    private final String name;
    private final String category;

    public BookResponseDto(long id, String name, String category){
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }
}
