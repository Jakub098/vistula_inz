package pl.edu.vistula.s61988.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.edu.vistula.s61988.model.Czytelnik;

public interface CzytelnikRepository extends JpaRepository<Czytelnik, Long>, CrudRepository<Czytelnik, Long> {
}
