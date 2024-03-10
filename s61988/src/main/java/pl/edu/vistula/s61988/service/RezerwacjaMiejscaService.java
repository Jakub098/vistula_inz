package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.RezerwacjaMiejsca;
import pl.edu.vistula.s61988.repository.RezerwacjaMiejscaRepository;

@Service
@RequiredArgsConstructor
public class RezerwacjaMiejscaService {

    private final RezerwacjaMiejscaRepository rezerwacjaMiejscaRepository;

    public Iterable<RezerwacjaMiejsca> getAllSeatReservations() {
        return  rezerwacjaMiejscaRepository.findAll();
    }
}
