package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Uzytkownik;
import pl.edu.vistula.s61988.service.UzytkownikService;
import pl.edu.vistula.s61988.views.Views;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UzytkownikController {

    private final UzytkownikService uzytkownikService;

    @GetMapping("/users")
    @JsonView(Views.UserView.class)
    public Iterable<Uzytkownik> getAllUsers() {
        return uzytkownikService.getAllUsers();
    }

}
