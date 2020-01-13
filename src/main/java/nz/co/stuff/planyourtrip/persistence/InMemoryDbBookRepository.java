package nz.co.stuff.planyourtrip.persistence;

import nz.co.stuff.planyourtrip.domain.Book;
import nz.co.stuff.planyourtrip.jpa.BookInMemoryRepository;
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

    }
}
