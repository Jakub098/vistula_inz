package pl.edu.vistula.s61988.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.edu.vistula.s61988.model.Film;

public interface FilmRepository extends JpaRepository<Film, Long>, CrudRepository<Film, Long> {
}
