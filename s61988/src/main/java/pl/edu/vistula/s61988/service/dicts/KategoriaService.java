package pl.edu.vistula.s61988.service.dicts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.dicts.KategoriaDict;
import pl.edu.vistula.s61988.repository.dicts.KategoriaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KategoriaService {

    private final KategoriaRepository kategoriaRepository;

    public List<KategoriaDict> getAllCategories() {
        return kategoriaRepository.findAll();
    }
}
