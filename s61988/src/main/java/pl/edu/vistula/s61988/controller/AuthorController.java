package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Author;
import pl.edu.vistula.s61988.service.AuthorService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService lektorService;

    @GetMapping("/authors")
    @JsonView(Views.AuthorView.class)
    @CrossOrigin
    public List<Author> getAllLectors() {
        return lektorService.getAllLectors();
    }
}
