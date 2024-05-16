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
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_film"
    )
    @JsonView({Views.MovieView.class, Views.ResourcesView.class})
    private Long id;

    @Column(name = "dlugosc"
    )
    @JsonView({Views.MovieView.class, Views.ResourcesView.class})
    private Long length;

    @OneToOne
    @JoinColumn(name = "id_film")
    private Resources resource;

}
