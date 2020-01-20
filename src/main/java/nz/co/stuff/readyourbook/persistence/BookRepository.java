package nz.co.stuff.readyourbook.persistence;

import java.util.List;

import nz.co.stuff.readyourbook.entity.Book;

public interface BookRepository {
    List<Book> getAllBooks();
    Book getBook(long id);
    void saveBook(Book book);
    // void updateReadingProgress();
}
