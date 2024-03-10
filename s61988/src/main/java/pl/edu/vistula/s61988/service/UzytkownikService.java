package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Uzytkownik;
import pl.edu.vistula.s61988.repository.UzytkownikRepository;

@Service
@RequiredArgsConstructor
public class UzytkownikService {

    private final UzytkownikRepository uzytkownikRepository;

    public Iterable<Uzytkownik> getAllUsers() {
        return uzytkownikRepository.findAll();
    }
}
