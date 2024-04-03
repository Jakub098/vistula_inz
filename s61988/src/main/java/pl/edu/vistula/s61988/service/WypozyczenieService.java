package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Wypozyczenie;
import pl.edu.vistula.s61988.repository.WypozyczenieRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WypozyczenieService {

    private final WypozyczenieRepository wypozyczenieRepository;

    public List<Wypozyczenie> getAllRents() {
        return wypozyczenieRepository.findAll();
    }
}
