package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@Entity
@Table(name = "Lektor")
@Getter
@Setter
public class Lektor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lektor"
    )
    @JsonView(Views.LektorView.class)
    private Long id;

    @Column(name = "imie"
    )
    @JsonView(Views.LektorView.class)
    private String name;

    @Column(name = "nazwisko"
    )
    @JsonView(Views.LektorView.class)
    private String surname;

    @OneToMany(mappedBy = "lektor")
    private List<Audiobook> audiobooki;

}
