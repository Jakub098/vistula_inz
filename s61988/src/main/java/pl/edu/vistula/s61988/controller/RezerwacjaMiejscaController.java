package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.RezerwacjaMiejsca;
import pl.edu.vistula.s61988.service.RezerwacjaMiejscaService;
import pl.edu.vistula.s61988.views.Views;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RezerwacjaMiejscaController {

    private final RezerwacjaMiejscaService rezerwacjaMiejscaService;

    @GetMapping("/seat-reservations")
    @JsonView(Views.SeatReservationView.class)
    public Iterable<RezerwacjaMiejsca> getAllSeatReservations() {
        return rezerwacjaMiejscaService.getAllSeatReservations();
    }
}
