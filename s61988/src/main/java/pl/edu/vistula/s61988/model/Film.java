package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

@Entity
@Table(name = "Film")
@Getter
@Setter
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_film"
    )
    @JsonView(Views.FilmView.class)
    private Long id;

    @JsonView(Views.FilmView.class)
    private String nazwa;
    @JsonView(Views.FilmView.class)
    private String opis;
    @JsonView(Views.FilmView.class)
    private int dlugosc;
}
