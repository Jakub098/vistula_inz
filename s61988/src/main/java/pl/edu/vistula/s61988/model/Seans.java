package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "Seans")
@Getter
@Setter
public class Seans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seans")
    @JsonView({Views.ScreeningView.class, Views.ReservationView.class})
    private Long id;

    @Column(name = "data_rozpoczecia")
    @JsonView({Views.ScreeningView.class, Views.ReservationView.class})
    private Instant seansDate;

    @ManyToOne
    @JoinColumn(name = "id_film", nullable = false)
    @JsonView(Views.ScreeningView.class)
    private Film film;

    @ManyToOne
    @JoinColumn(name = "id_sala", nullable = false)
    @JsonView(Views.ScreeningView.class)
    private Sala hall;

    @OneToMany(mappedBy = "screening")
    private List<Rezerwacja> reservations;

}
