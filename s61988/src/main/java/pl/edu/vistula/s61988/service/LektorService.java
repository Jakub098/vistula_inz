package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Lektor;
import pl.edu.vistula.s61988.repository.LektorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LektorService {

    private final LektorRepository lektorRepository;

    public List<Lektor> getAllLectors() {
        return lektorRepository.findAll();
    }
}
