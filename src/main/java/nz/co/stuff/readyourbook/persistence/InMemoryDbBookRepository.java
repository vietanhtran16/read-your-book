package nz.co.stuff.readyourbook.persistence;

import nz.co.stuff.readyourbook.entity.Book;
import nz.co.stuff.readyourbook.jpa.BookInMemoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryDbBookRepository implements BookRepository {
    private final BookInMemoryRepository bookInMemoryRepository;

    public InMemoryDbBookRepository(BookInMemoryRepository bookInMemoryRepository) {
        this.bookInMemoryRepository = bookInMemoryRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        this.bookInMemoryRepository.findAll().forEach(books::add);
        return books;
    }

    @Override
    public Book getBook(long id) {
        return this.bookInMemoryRepository.findById(id).get();
    }

    @Override
    public void saveBook(Book book) {
        this.bookInMemoryRepository.save(book);
    }
}
