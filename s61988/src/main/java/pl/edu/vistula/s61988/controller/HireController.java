package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Hire;
import pl.edu.vistula.s61988.service.HireService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HireController {

    private final HireService wypozyczenieService;

    @GetMapping("/rents")
    @JsonView(Views.HireView.class)
    @CrossOrigin
    public List<Hire> getAllRents() {
        return wypozyczenieService.getAllRents();
    }
}
