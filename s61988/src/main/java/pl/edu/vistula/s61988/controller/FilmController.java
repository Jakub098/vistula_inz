package pl.edu.vistula.s61988.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.edu.vistula.s61988.model.Film;
import pl.edu.vistula.s61988.model.dto.FilmDto;
import pl.edu.vistula.s61988.service.FilmService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class FilmController {

    private final FilmService filmService;

    @GetMapping("/films")
    public Iterable<Film> getAllFilms() {
        return filmService.getAllFilms();
    }

    @GetMapping("/film/{id}")
    public Film getFilmById(@PathVariable final Long id) {
        return filmService.getFilmById(id);
    }

    @PostMapping("/film")
    public void addFilm(@RequestBody FilmDto filmDto) {
        filmService.addFilm(filmDto);
    }

    @DeleteMapping("/film/{id}")
    public void deleteFilm(@PathVariable Long id) {
        filmService.deleteFilm(id);
    }

    @PutMapping("/film/{id}")
    public void updateFilm(@PathVariable Long id, @RequestBody FilmDto filmDto) {
        filmService.updateFilm(id, filmDto);
    }

}
