package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

@Entity
@Table(name = "Ksiazka")
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ksiazka"
    )
    @JsonView(Views.BookView.class)
    private Long id;

    @JsonView(Views.BookView.class)
    private String isbn;

    @OneToOne
    @JoinColumn(name = "id_ksiazka")
    private Resources resource;

}
