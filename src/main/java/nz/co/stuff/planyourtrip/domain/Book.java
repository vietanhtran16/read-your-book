package nz.co.stuff.planyourtrip.domain;

public class Book {
    private static long currentId = 0;
    private final long id;
    private final String name;
    private final String category;

    public Book(){
        this(null, null);
    }
    public Book(String name, String category){
        this.id = ++currentId;
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
