package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Pracownik;
import pl.edu.vistula.s61988.service.PracownikService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PracownikController {

    private final PracownikService pracownikService;

    @GetMapping("/employees")
    @JsonView(Views.PracownikView.class)
    public List<Pracownik> getAllEmployees() {
        return pracownikService.getAllEmployees();
    }
}
