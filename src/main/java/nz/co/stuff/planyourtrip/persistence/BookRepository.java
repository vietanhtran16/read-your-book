package nz.co.stuff.planyourtrip.persistence;

import java.util.List;

import nz.co.stuff.planyourtrip.domain.Book;

public interface BookRepository {
    List<Book> getAllBooks();
    Book getBook(long id);
    void saveBook(Book book);
    void updateReadingProgress();
}
