package pl.edu.vistula.s61988.service.dicts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.dicts.DostepnoscDict;
import pl.edu.vistula.s61988.repository.dicts.DostepnoscRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DostepnoscService {

    private final DostepnoscRepository dostepnoscRepository;

    public List<DostepnoscDict> getAllStatuses() {
        return dostepnoscRepository.findAll();
    }
}
