package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Konto;
import pl.edu.vistula.s61988.service.KontoService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class KontoController {

    private final KontoService kontoService;

    @GetMapping("/accounts")
    @JsonView(Views.KontoView.class)
    public List<Konto> getAllAccounts() {
        return kontoService.getAllAccounts();
    }
}
