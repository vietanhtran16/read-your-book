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
import nz.co.stuff.planyourtrip.dto.BookRequestDto;
import nz.co.stuff.planyourtrip.dto.BookResponseDto;
import nz.co.stuff.planyourtrip.persistence.BookRepository;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private final BookRepository bookRepository;
    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<BookResponseDto> getAllBooks() {
        var books = this.bookRepository.getAllBooks();
        return toBookResponseDtos(books);
    }

    @GetMapping("/{id}")
    public BookResponseDto getBook(@PathVariable("id") long id){
        var book = this.bookRepository.getBook(id);
        return toBookResponseDto(book);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBook(@RequestBody BookRequestDto bookRequestDto){
        var book = toBook(bookRequestDto);
        this.bookRepository.saveBook(book);
    }

    private BookResponseDto toBookResponseDto(Book book){
        return new BookResponseDto(book.getId(), book.getName(), book.getCategory());
    }

    private List<BookResponseDto> toBookResponseDtos(List<Book> books){
        return books.stream().map(this::toBookResponseDto).collect(Collectors.toList());
    }

    private Book toBook(BookRequestDto bookDto){
        return new Book(bookDto.getName(), bookDto.getCategory());
    }
}
