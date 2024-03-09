package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Sala;
import pl.edu.vistula.s61988.model.dto.SalaDto;
import pl.edu.vistula.s61988.repository.SalaRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SalaService {

    private final SalaRepository salaRepository;

    public Iterable<Sala> getAllHalls() {
        return salaRepository.findAll();
    }

    public Sala getHallById(Long id) {
        Optional<Sala> hall = salaRepository.findById(id);

        return hall.orElse(null);
    }

    public void addHall(SalaDto salaDto) {
        Sala hall = new Sala();
        hall.setNumer(salaDto.getNumer());

        salaRepository.save(hall);
    }

    public void deleteHall(Long id) {
        Sala selectedHall = getHallById(id);
        salaRepository.delete(selectedHall);
    }

    public void updateHall(Long id, SalaDto salaDto) {
        Sala hall = getHallById(id);

        hall.setNumer(salaDto.getNumer());
        salaRepository.save(hall);
    }
}
