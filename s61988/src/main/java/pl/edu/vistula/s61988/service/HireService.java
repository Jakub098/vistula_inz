package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Hire;
import pl.edu.vistula.s61988.repository.HireRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HireService {

    private final HireRepository wypozyczenieRepository;

    public List<Hire> getAllRents() {
        return wypozyczenieRepository.findAll();
    }
}
