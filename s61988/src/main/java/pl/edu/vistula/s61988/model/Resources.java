package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.util.Date;

@Entity
@Table(name = "Zasoby")
@Getter
@Setter
public class Resources {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zasob"
    )
    @JsonView(Views.ResourcesView.class)
    private Long id;

    @Column(name = "tytul"
    )
    @JsonView(Views.ResourcesView.class)
    private String title;

    @Column(name = "rok_wydania"
    )
    @JsonView(Views.ResourcesView.class)
    private Date realiseDate;

}
