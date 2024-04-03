package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Czytelnik;
import pl.edu.vistula.s61988.repository.CzytelnikRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CzytelnikService {

    private final CzytelnikRepository czytelnikRepository;

    public List<Czytelnik> getAllClients() {
        return czytelnikRepository.findAll();
    }
}
