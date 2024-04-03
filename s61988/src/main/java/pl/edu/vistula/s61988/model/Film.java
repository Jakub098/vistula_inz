package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.model.dicts.KategoriaDict;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

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

    @Column(name = "rezyser"
    )
    @JsonView(Views.FilmView.class)
    private String director;

    @ManyToOne
    @JoinColumn(name = "id_kategoria", nullable = false)
    private KategoriaDict kategoria;

    @ManyToOne
    @JoinColumn(name = "id_zasob", nullable = false)
    private Zasoby film;

}
