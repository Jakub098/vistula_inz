package pl.edu.vistula.s61988.repository.dicts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.edu.vistula.s61988.model.dicts.AvailabilityDict;

public interface DostepnoscRepository extends JpaRepository<AvailabilityDict, Long>, CrudRepository<AvailabilityDict, Long> {
}
