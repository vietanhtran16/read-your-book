package nz.co.stuff.planyourtrip.jpa;

import nz.co.stuff.planyourtrip.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookInMemoryRepository extends CrudRepository<Book, Long> {
}
