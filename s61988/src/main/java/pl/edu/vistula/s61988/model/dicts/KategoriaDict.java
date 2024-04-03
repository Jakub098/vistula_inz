package pl.edu.vistula.s61988.model.dicts;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.model.Audiobook;
import pl.edu.vistula.s61988.model.Film;
import pl.edu.vistula.s61988.model.Ksiazka;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@Entity
@Table(name = "Kategoria_dict")
@Getter
@Setter
public class KategoriaDict {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kategoria"
    )
    @JsonView(Views.KategoriaDictView.class)
    private Long id;

    @JsonView(Views.KategoriaDictView.class)
    private String nazwa;

    @OneToMany(mappedBy = "kategoria")
    private List<Audiobook> audiobooki;

    @OneToMany(mappedBy = "kategoria")
    private List<Film> filmy;

    @OneToMany(mappedBy = "kategoria")
    private List<Ksiazka> ksiazki;

}
