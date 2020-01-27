package nz.co.stuff.readyourbook.api;

import nz.co.stuff.readyourbook.dto.BookRequestDto;
import nz.co.stuff.readyourbook.dto.ReadingProgressRequestDto;
import nz.co.stuff.readyourbook.dto.ReadingProgressResponseDto;
import nz.co.stuff.readyourbook.entity.ReadingProgress;
import nz.co.stuff.readyourbook.persistence.BookRepository;
import nz.co.stuff.readyourbook.persistence.ReadingProgressRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/reading-progress")
public class ReadingProgressController {
    private final ReadingProgressRepository readingProgressRepository;
    private final BookRepository bookRepository;
    public ReadingProgressController(ReadingProgressRepository readingProgressRepository, BookRepository bookRepository) {
        this.readingProgressRepository = readingProgressRepository;
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<ReadingProgressResponseDto> getAllReadingProgresses() {
        var readingProgresses = this.readingProgressRepository.getAllReadingProgress();
        return toReadingProgressResponseDtos(readingProgresses);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveReadingProgress(@RequestBody ReadingProgressRequestDto readingProgressRequestDto) {
        var readingProgress = this.toReadingProgress(readingProgressRequestDto);
        this.readingProgressRepository.saveReadingProgress(readingProgress);
    }

    private ReadingProgress toReadingProgress(ReadingProgressRequestDto readingProgressRequestDto) {
        var book = this.bookRepository.getBook(readingProgressRequestDto.getBookId());
        return new ReadingProgress(new Date(), readingProgressRequestDto.getPercentageCompleted(), book);
    }

    private ReadingProgressResponseDto toReadingProgressResponseDto(ReadingProgress readingProgress){
        return new ReadingProgressResponseDto(readingProgress.getId(), readingProgress.getBookId(), readingProgress.getPercentageCompleted(), readingProgress.getTimestamp());
    }

    private List<ReadingProgressResponseDto> toReadingProgressResponseDtos(List<ReadingProgress> books){
        return books.stream().map(this::toReadingProgressResponseDto).collect(Collectors.toList());
    }
}
