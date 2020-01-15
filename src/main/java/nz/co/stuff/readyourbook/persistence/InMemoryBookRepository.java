package nz.co.stuff.readyourbook.persistence;

import java.util.ArrayList;
import java.util.List;

import nz.co.stuff.readyourbook.domain.Book;

//@Repository
public class InMemoryBookRepository implements BookRepository {
    private static List<Book> books = new ArrayList<>();

    public InMemoryBookRepository(){
        books.add(new Book("Clean code", "Software Development"));
        books.add(new Book("Clean architecture", "Software Development"));
        books.add(new Book("Hehe", "Software Development"));
    }

    @Override
    public List<Book> getAllBooks() {
        return InMemoryBookRepository.books;
    }

    @Override
    public Book getBook(long id) {
        return InMemoryBookRepository.books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void saveBook(Book book) {
        books.add(book);
    }
}
