package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.model.dicts.KategoriaDict;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@Entity
@Table(name = "Ksiazka")
@Getter
@Setter
public class Ksiazka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ksiazka"
    )
    @JsonView(Views.KsiazkaView.class)
    private Long id;

    @JsonView(Views.KsiazkaView.class)
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "id_kategoria", nullable = false)
    private KategoriaDict kategoria;

    @ManyToOne
    @JoinColumn(name = "id_zasob", nullable = false)
    private Zasoby ksiazka;

}
