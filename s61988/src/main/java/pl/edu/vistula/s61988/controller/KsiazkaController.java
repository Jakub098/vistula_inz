package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Ksiazka;
import pl.edu.vistula.s61988.service.KsiazkaService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class KsiazkaController {

    private final KsiazkaService ksiazkaService;

    @GetMapping("/books")
    @JsonView(Views.KsiazkaView.class)
    public List<Ksiazka> getAllBooks() {
        return ksiazkaService.getAllBooks();
    }
}
