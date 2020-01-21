package nz.co.stuff.readyourbook.jpa;

import nz.co.stuff.readyourbook.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookInMemoryRepository extends JpaRepository<Book, Long> {
}
