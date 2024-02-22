package pl.edu.vistula.s61988.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Film;
import pl.edu.vistula.s61988.model.dto.FilmDto;
import pl.edu.vistula.s61988.repository.FilmRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FilmService {

    private final FilmRepository filmRepository;

    public Iterable<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public Film getFilmById(Long id) {
        Optional<Film> film = filmRepository.findById(id);

        return film.orElse(null);
    }

    @Transactional
    public void addFilm(FilmDto filmDto) {
        Film film = new Film();
        film.setNazwa(filmDto.getNazwa());
        film.setOpis(filmDto.getOpis());
        film.setDlugosc(filmDto.getDlugosc());

        filmRepository.save(film);
    }

    @Transactional
    public void deleteFilm(Long id) {
        Film selectedFilm = getFilmById(id);
        filmRepository.delete(selectedFilm);
    }

    @Transactional
    public void updateFilm(Long id, FilmDto filmDto) {
        Film film = filmRepository.findById(id).orElseThrow(() -> new RuntimeException("Film nie istnije")); //TODO dodać exceptiony

        film.setNazwa(filmDto.getNazwa());
        film.setOpis(filmDto.getOpis());
        film.setDlugosc(filmDto.getDlugosc());

        filmRepository.save(film);
    }
}
