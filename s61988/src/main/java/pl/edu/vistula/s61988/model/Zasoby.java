package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.model.dicts.DostepnoscDict;
import pl.edu.vistula.s61988.model.dicts.KategoriaDict;
import pl.edu.vistula.s61988.views.Views;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Zasoby")
@Getter
@Setter
public class Zasoby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zasob"
    )
    @JsonView(Views.ZasobyView.class)
    private Long id;

    @Column(name = "tytul"
    )
    @JsonView(Views.ZasobyView.class)
    private String title;

    @Column(name = "rok_wydania"
    )
    @JsonView(Views.ZasobyView.class)
    private Date realiseDate;

    @ManyToOne
    @JoinColumn(name = "id_dostepnosc", nullable = false)
    private DostepnoscDict dostepnosc;

    @OneToMany(mappedBy = "audiobook")
    private List<Audiobook> audiobookList;

    @OneToMany(mappedBy = "ksiazka")
    private List<Ksiazka> ksiazkaList;

    @OneToMany(mappedBy = "film")
    private List<Film> filmList;

}
