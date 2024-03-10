package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@Entity
@Table(name = "Miejsce")
@Getter
@Setter
public class Miejsce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_miejsce")
    @JsonView(Views.SeatView.class)
    private Long id;

    @JsonView(Views.SeatView.class)
    private Long rzad;
    @JsonView(Views.SeatView.class)
    private Long miejsce;

    @ManyToOne
    @JoinColumn(name = "id_sala", nullable = false)
    @JsonView(Views.SeatView.class)
    private Sala sala;

}
