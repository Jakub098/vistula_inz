package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Miejsce;
import pl.edu.vistula.s61988.service.MiejsceService;
import pl.edu.vistula.s61988.views.Views;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MiejsceController {

    private final MiejsceService miejsceService;

    @GetMapping("/seats")
    @JsonView(Views.SeatView.class)
    public Iterable<Miejsce> getAllSeats() {
        return miejsceService.getAllSeats();
    }

    @GetMapping("/seat/{id}")
    @JsonView(Views.SeatView.class)
    public Miejsce getSeatById(@PathVariable final Long id) {
        return miejsceService.getSeatById(id);
    }
}
