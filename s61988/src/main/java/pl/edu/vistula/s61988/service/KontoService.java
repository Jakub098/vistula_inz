package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Konto;
import pl.edu.vistula.s61988.repository.KontoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KontoService {

    private final KontoRepository kontoRepository;

    public List<Konto> getAllAccounts() {
        return kontoRepository.findAll();
    }
}
