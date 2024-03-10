package pl.edu.vistula.s61988.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.edu.vistula.s61988.model.RezerwacjaMiejsca;

public interface RezerwacjaMiejscaRepository extends JpaRepository<RezerwacjaMiejsca, Long>, CrudRepository<RezerwacjaMiejsca, Long>  {
}
