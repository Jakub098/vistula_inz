package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Sala;
import pl.edu.vistula.s61988.model.Seans;
import pl.edu.vistula.s61988.repository.SeansRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SeansService {

    private final SeansRepository seansRepository;

    public Iterable<Seans> getAllScreenings() {
        return seansRepository.findAll();
    }

    public Seans getScreeningById(Long id) {
        Optional<Seans> screening = seansRepository.findById(id);

        return screening.orElse(null);
    }
}
