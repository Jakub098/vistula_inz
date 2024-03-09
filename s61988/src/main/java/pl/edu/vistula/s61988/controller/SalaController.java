package pl.edu.vistula.s61988.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.edu.vistula.s61988.model.Film;
import pl.edu.vistula.s61988.model.Sala;
import pl.edu.vistula.s61988.model.dto.FilmDto;
import pl.edu.vistula.s61988.model.dto.SalaDto;
import pl.edu.vistula.s61988.service.SalaService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SalaController {

    private final SalaService salaService;

    @GetMapping("/halls")
    public Iterable<Sala> getAllHalls() {
        return salaService.getAllHalls();
    }

    @GetMapping("/hall/{id}")
    public Sala getHallById(@PathVariable final Long id) {
        return salaService.getHallById(id);
    }

    @PostMapping("/hall")
    public void addHall(@RequestBody SalaDto salaDto) {
        salaService.addHall(salaDto);
    }

    @DeleteMapping("/hall/{id}")
    public void deleteHall(@PathVariable Long id) {
        salaService.deleteHall(id);
    }

    @PutMapping("/hall/{id}")
    public void updateHall(@PathVariable Long id, @RequestBody SalaDto salaDto) {
        salaService.updateHall(id, salaDto);
    }

}
