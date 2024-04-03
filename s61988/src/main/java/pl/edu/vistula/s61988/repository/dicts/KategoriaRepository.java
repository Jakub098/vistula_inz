package pl.edu.vistula.s61988.repository.dicts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.edu.vistula.s61988.model.dicts.KategoriaDict;

public interface KategoriaRepository extends JpaRepository<KategoriaDict, Long>, CrudRepository<KategoriaDict, Long>  {
}
