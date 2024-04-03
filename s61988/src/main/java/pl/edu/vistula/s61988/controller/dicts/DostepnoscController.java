package pl.edu.vistula.s61988.controller.dicts;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.dicts.DostepnoscDict;
import pl.edu.vistula.s61988.service.dicts.DostepnoscService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DostepnoscController {

    private final DostepnoscService dostepnoscService;

    @GetMapping("/dicst/statuses")
    @JsonView(Views.DostepnoscDictView.class)
    public List<DostepnoscDict> getAllStatuses() {
        return dostepnoscService.getAllStatuses();
    }

}
