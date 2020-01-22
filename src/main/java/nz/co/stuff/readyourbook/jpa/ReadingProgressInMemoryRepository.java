package nz.co.stuff.readyourbook.jpa;
import nz.co.stuff.readyourbook.entity.ReadingProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadingProgressInMemoryRepository extends JpaRepository<ReadingProgress, Long> {
}
