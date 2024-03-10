package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Rezerwacja;
import pl.edu.vistula.s61988.service.RezerwacjaService;
import pl.edu.vistula.s61988.views.Views;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RezerwacjaController {

    private final RezerwacjaService rezerwacjaService;

    @GetMapping("/reservations")
    @JsonView(Views.ReservationView.class)
    public Iterable<Rezerwacja> getAllReservations() {
        return rezerwacjaService.getAllReservations();
    }

}
