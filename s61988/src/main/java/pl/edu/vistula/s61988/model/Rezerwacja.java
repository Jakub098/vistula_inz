package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "Rezerwacja")
@Getter
@Setter
public class Rezerwacja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rezerwacja"
    )
    @JsonView(Views.ReservationView.class)
    private Long id;

    @JsonView(Views.ReservationView.class)
    private Instant data_rezerwacji;

    @JsonView(Views.ReservationView.class)
    private String numer_rezerwacji;

    @ManyToOne
    @JoinColumn(name = "id_uzytkownik", nullable = false)
    @JsonView(Views.ReservationView.class)
    private Uzytkownik user;

    @ManyToOne
    @JoinColumn(name = "id_seans", nullable = false)
    @JsonView(Views.ReservationView.class)
    private Seans screening;

    @OneToMany(mappedBy = "reservation")
    private List<RezerwacjaMiejsca> reservations;
}
