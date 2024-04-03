package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Ksiazka;
import pl.edu.vistula.s61988.repository.KsiazkaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KsiazkaService {

    private final KsiazkaRepository ksiazkaRepository;

    public List<Ksiazka> getAllBooks() {
        return ksiazkaRepository.findAll();
    }
}
