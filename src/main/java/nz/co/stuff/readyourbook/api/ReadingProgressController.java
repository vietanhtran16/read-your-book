package nz.co.stuff.readyourbook.api;

import nz.co.stuff.readyourbook.dto.ReadingProgressResponseDto;
import nz.co.stuff.readyourbook.entity.ReadingProgress;
import nz.co.stuff.readyourbook.persistence.ReadingProgressRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/reading-progress")
public class ReadingProgressController {
    private final ReadingProgressRepository readingProgressRepository;
    public ReadingProgressController(ReadingProgressRepository readingProgressRepository) {
        this.readingProgressRepository = readingProgressRepository;
    }

    @GetMapping
    public List<ReadingProgressResponseDto> getAllReadingProgresses() {
        var readingProgresses = this.readingProgressRepository.getAllReadingProgress();
        return toReadingProgressResponseDtos(readingProgresses);
    }

    private ReadingProgressResponseDto toReadingProgressResponseDto(ReadingProgress readingProgress){
        return new ReadingProgressResponseDto(readingProgress.getId(), readingProgress.getBookId(), readingProgress.getPercentageCompleted(), readingProgress.getTimestamp());
    }

    private List<ReadingProgressResponseDto> toReadingProgressResponseDtos(List<ReadingProgress> books){
        return books.stream().map(this::toReadingProgressResponseDto).collect(Collectors.toList());
    }
}
