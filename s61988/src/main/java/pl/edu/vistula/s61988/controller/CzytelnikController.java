package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Czytelnik;
import pl.edu.vistula.s61988.service.CzytelnikService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CzytelnikController {

    private final CzytelnikService czytelnikService;

    @GetMapping("/clients")
    @JsonView(Views.CzytelnikView.class)
    public List<Czytelnik> getAllClients() {
        return czytelnikService.getAllClients();
    }
}
