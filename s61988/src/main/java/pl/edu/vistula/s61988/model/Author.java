package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;


@Entity
@Table(name = "Autor")
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_autor"
    )
    @JsonView(Views.AuthorView.class)
    private Long id;

    @Column(name = "imie"
    )
    @JsonView({Views.AuthorView.class, Views.ResourcesView.class})
    private String name;

    @Column(name = "nazwisko"
    )
    @JsonView({Views.AuthorView.class, Views.ResourcesView.class})
    private String surname;

    @OneToMany(mappedBy = "author")
    private List<Resources> resources;
}
