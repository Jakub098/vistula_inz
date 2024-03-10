package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Film;
import pl.edu.vistula.s61988.model.Sala;
import pl.edu.vistula.s61988.model.Seans;
import pl.edu.vistula.s61988.service.SeansService;
import pl.edu.vistula.s61988.views.Views;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SeansController {

    private final SeansService seansService;

    @GetMapping("/screenings")
    @JsonView(Views.ScreeningView.class)
    public Iterable<Seans> getAllScreenings() {
        return seansService.getAllScreenings();
    }

    @GetMapping("/screening/{id}")
    @JsonView(Views.ScreeningView.class)
    public Seans getScreeningById(@PathVariable final Long id) {
        return seansService.getScreeningById(id);
    }

}
