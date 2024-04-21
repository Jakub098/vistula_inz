package pl.edu.vistula.s61988.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.edu.vistula.s61988.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>, CrudRepository<Author, Long> {
}
