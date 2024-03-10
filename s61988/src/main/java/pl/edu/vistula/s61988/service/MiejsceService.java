package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Miejsce;
import pl.edu.vistula.s61988.model.Sala;
import pl.edu.vistula.s61988.repository.MiejsceRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MiejsceService {

    private final MiejsceRepository miejsceRepository;

    public Iterable<Miejsce> getAllSeats() {
        return miejsceRepository.findAll();
    }

    public Miejsce getSeatById(Long id) {
        Optional<Miejsce> seat = miejsceRepository.findById(id);

        return seat.orElse(null);
    }
}
