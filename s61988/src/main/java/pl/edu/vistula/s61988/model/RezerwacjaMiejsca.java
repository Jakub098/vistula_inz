package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

@Entity
@Table(name = "RezerwacjaMiejsca")
@Getter
@Setter
public class RezerwacjaMiejsca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rezmsc"
    )
    @JsonView(Views.SeatReservationView.class)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_rezerwacja", nullable = false)
    @JsonView(Views.SeatReservationView.class)
    private Rezerwacja reservation;

    @ManyToOne
    @JoinColumn(name = "id_miejsce", nullable = false)
    @JsonView(Views.SeatReservationView.class)
    private Miejsce seat;

}
