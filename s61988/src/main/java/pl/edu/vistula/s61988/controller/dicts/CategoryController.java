package pl.edu.vistula.s61988.controller.dicts;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.dicts.CategoryDict;
import pl.edu.vistula.s61988.service.dicts.KategoriaService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CategoryController {

    private final KategoriaService kategoriaService;

    @GetMapping("/dicst/categories")
    @JsonView(Views.CategoryDictView.class)
    @CrossOrigin
    public List<CategoryDict> getAllCategories() {
        return kategoriaService.getAllCategories();
    }
}
