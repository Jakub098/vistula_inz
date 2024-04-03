package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Lektor;
import pl.edu.vistula.s61988.service.LektorService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class LektorController {

    private final LektorService lektorService;

    @GetMapping("/lectors")
    @JsonView(Views.LektorView.class)
    public List<Lektor> getAllLectors() {
        return lektorService.getAllLectors();
    }
}
