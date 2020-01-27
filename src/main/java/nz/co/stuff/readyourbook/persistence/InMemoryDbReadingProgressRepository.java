package nz.co.stuff.readyourbook.persistence;

import nz.co.stuff.readyourbook.entity.ReadingProgress;
import nz.co.stuff.readyourbook.jpa.ReadingProgressInMemoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryDbReadingProgressRepository implements ReadingProgressRepository {
    private final ReadingProgressInMemoryRepository readingProgressInMemoryRepository;

    public InMemoryDbReadingProgressRepository(ReadingProgressInMemoryRepository readingProgressInMemoryRepository) {
        this.readingProgressInMemoryRepository = readingProgressInMemoryRepository;
    }

    @Override
    public List<ReadingProgress> getAllReadingProgress() {
        return new ArrayList<>(this.readingProgressInMemoryRepository.findAll());
    }

    @Override
    public void saveReadingProgress(ReadingProgress readingProgress) {
        this.readingProgressInMemoryRepository.save(readingProgress);
    }
}
