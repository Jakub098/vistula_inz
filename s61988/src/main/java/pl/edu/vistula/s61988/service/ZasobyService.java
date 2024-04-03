package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Zasoby;
import pl.edu.vistula.s61988.repository.ZasobyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ZasobyService {

    private final ZasobyRepository zasobyRepository;

    public List<Zasoby> getAllResources() {
        return zasobyRepository.findAll();
    }
}
