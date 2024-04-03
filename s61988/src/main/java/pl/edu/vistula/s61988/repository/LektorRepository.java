package pl.edu.vistula.s61988.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.edu.vistula.s61988.model.Lektor;

public interface LektorRepository extends JpaRepository<Lektor, Long>, CrudRepository<Lektor, Long> {
}
