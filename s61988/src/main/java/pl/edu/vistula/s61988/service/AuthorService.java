package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Author;
import pl.edu.vistula.s61988.repository.AuthorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository lektorRepository;

    public List<Author> getAllLectors() {
        return lektorRepository.findAll();
    }
}
