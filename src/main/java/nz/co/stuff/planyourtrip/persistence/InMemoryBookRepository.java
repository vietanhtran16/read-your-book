package nz.co.stuff.planyourtrip.persistence;

import nz.co.stuff.planyourtrip.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class InMemoryBookRepository implements BookRepository {
    private static List<Book> books = Arrays.asList(
            new Book(1, "Clean code", "Software"),
            new Book(2, "Clean architecture", "Software"),
            new Book(3, "Hello world", "Software")
    );
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
}
