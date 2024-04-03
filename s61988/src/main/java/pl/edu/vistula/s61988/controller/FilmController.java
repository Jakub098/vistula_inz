package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Film;
import pl.edu.vistula.s61988.service.FilmService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class FilmController {

    private final FilmService filmService;

    @GetMapping("/movies")
    @JsonView(Views.FilmView.class)
    public List<Film> getAllMovies() {
        return filmService.getAllMovies();
    }
}
