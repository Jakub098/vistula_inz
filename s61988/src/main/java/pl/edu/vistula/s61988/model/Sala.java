package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@Entity
@Table(name = "Sala")
@Getter
@Setter
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sala")
    @JsonView(Views.HallView.class)
    private Long id;

    @JsonView({Views.HallView.class, Views.ScreeningView.class, Views.SeatView.class})
    private Long numer;

    @OneToMany(mappedBy = "hall")
    private List<Seans> halls;

    @OneToMany(mappedBy = "sala")
    private List<Miejsce> miejsca;

}
