package nz.co.stuff.planyourtrip.api;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import nz.co.stuff.planyourtrip.domain.Book;
import nz.co.stuff.planyourtrip.dto.BookDto;
import nz.co.stuff.planyourtrip.persistence.BookRepository;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private final BookRepository bookRepository;
    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<BookDto> getAllBooks() {
        var books = this.bookRepository.getAllBooks();
        return books.stream().map(book -> toDto(book)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public BookDto getBook(@PathVariable("id") long id){
        var book = this.bookRepository.getBook(id);
        return toDto(book);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBook(@RequestBody Book book){
        this.bookRepository.saveBook(book);
    }

    private BookDto toDto(Book book){
        return new BookDto(book.getId(), book.getName(), book.getCategory());
    }
}

