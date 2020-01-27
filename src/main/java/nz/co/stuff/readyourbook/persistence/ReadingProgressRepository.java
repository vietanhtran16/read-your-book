package nz.co.stuff.readyourbook.persistence;

import nz.co.stuff.readyourbook.entity.ReadingProgress;

import java.util.List;

public interface ReadingProgressRepository {
    List<ReadingProgress> getAllReadingProgress();
    void saveReadingProgress(ReadingProgress readingProgress);
}
