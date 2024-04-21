package pl.edu.vistula.s61988.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.edu.vistula.s61988.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>, CrudRepository<Book, Long> {
}
