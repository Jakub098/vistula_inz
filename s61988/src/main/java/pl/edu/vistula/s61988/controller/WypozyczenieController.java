package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Wypozyczenie;
import pl.edu.vistula.s61988.service.WypozyczenieService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class WypozyczenieController {

    private final WypozyczenieService wypozyczenieService;

    @GetMapping("/rents")
    @JsonView(Views.WypozyczenieView.class)
    public List<Wypozyczenie> getAllRents() {
        return wypozyczenieService.getAllRents();
    }
}
