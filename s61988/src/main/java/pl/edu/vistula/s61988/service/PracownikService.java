package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Pracownik;
import pl.edu.vistula.s61988.repository.PracownikRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PracownikService {

    private final PracownikRepository pracownikRepository;

    public List<Pracownik> getAllEmployees() {
        return pracownikRepository.findAll();
    }
}
