package nz.co.stuff.readyourbook.jpa;

import nz.co.stuff.readyourbook.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookInMemoryRepository extends CrudRepository<Book, Long> {
}
