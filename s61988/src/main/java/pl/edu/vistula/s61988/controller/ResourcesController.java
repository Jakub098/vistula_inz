package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Resources;
import pl.edu.vistula.s61988.service.ResourcesService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ResourcesController {

    private final ResourcesService zasobyService;

    @GetMapping("/resources")
    @JsonView(Views.ResourcesView.class)
    @CrossOrigin
    public List<Resources> getAllResources() {
        return zasobyService.getAllResources();
    }
}
