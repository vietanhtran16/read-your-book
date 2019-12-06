package nz.co.stuff.planyourtrip.persistence;

import nz.co.stuff.planyourtrip.domain.Book;
import nz.co.stuff.planyourtrip.domain.Trip;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBooks();
    Book getBook(long id);
    void saveBook(Book book);
}
