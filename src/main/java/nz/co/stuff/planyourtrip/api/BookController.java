package nz.co.stuff.planyourtrip.api;

import nz.co.stuff.planyourtrip.domain.Book;
import nz.co.stuff.planyourtrip.persistence.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private final BookRepository bookRepository;
    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return this.bookRepository.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") long id){
        return this.bookRepository.getBook(id);
    }
}

