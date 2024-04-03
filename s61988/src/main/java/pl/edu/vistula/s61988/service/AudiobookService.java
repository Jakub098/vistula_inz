package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Audiobook;
import pl.edu.vistula.s61988.repository.AudiobookRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AudiobookService {

    private final AudiobookRepository audiobookRepository;

    public List<Audiobook> getAllAudiobooks() {
        return audiobookRepository.findAll();
    }
}
