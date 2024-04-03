package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.model.dicts.KategoriaDict;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@Entity
@Table(name = "Audiobook")
@Getter
@Setter
public class Audiobook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_audiobook"
    )
    @JsonView(Views.AudiobookView.class)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_lektor", nullable = false)
    private Lektor lektor;

    @ManyToOne
    @JoinColumn(name = "id_kategoria", nullable = false)
    private KategoriaDict kategoria;

    @ManyToOne
    @JoinColumn(name = "id_zasob", nullable = false)
    private Zasoby audiobook;
}
