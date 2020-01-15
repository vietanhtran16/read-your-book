package nz.co.stuff.readyourbook.dto;

public class BookRequestDto {
    private final String name;
    private final String category;

    public BookRequestDto(){
        this.name = "";
        this.category = "";
    }

    public BookRequestDto(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }
}
