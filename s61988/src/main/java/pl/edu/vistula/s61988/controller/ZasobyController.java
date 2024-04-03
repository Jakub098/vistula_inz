package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Zasoby;
import pl.edu.vistula.s61988.service.ZasobyService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ZasobyController {

    private final ZasobyService zasobyService;

    @GetMapping("/resources")
    @JsonView(Views.ZasobyView.class)
    public List<Zasoby> getAllResources() {
        return zasobyService.getAllResources();
    }
}
