package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Rezerwacja;
import pl.edu.vistula.s61988.repository.RezerwacjaRepository;

@Service
@RequiredArgsConstructor
public class RezerwacjaService {

    private final RezerwacjaRepository rezerwacjaRepository;

    public Iterable<Rezerwacja> getAllReservations() {
        return rezerwacjaRepository.findAll();
    }
}
