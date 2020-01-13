package nz.co.stuff.planyourtrip.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
    private static long currentId = 0;
    @Id
    @GeneratedValue
    private final long id;
    private final String name;
    private final String category;

    public Book() {
        this.id = ++currentId;
        this.name = "";
        this.category = "";
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
