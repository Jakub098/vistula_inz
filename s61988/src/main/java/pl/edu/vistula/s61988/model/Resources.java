package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.model.dicts.AvailabilityDict;
import pl.edu.vistula.s61988.model.dicts.CategoryDict;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@Entity
@Table(name = "Zasoby")
@Getter
@Setter
public class Resources {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zasob"
    )
    @JsonView({Views.ResourcesView.class, Views.HireView.class})
    private Long id;

    @Column(name = "tytul"
    )
    @JsonView({Views.ResourcesView.class, Views.HireView.class})
    private String title;

    @Column(name = "rok_wydania"
    )
    @JsonView(Views.ResourcesView.class)
    private Long realiseDate;

    @ManyToOne
    @JoinColumn(name = "id_status_aktywnosci", nullable = false)
    @JsonView(Views.ResourcesView.class)
    private AvailabilityDict availabilityStatus;

    @ManyToOne
    @JoinColumn(name = "id_kategoria", nullable = false)
    @JsonView(Views.ResourcesView.class)
    private CategoryDict category;

    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    @JsonView(Views.ResourcesView.class)
    private Author author;

    @OneToMany(mappedBy = "resource")
    private List<Hire> hires;

    //book
    @OneToOne(mappedBy = "resource")
    @JsonView(Views.ResourcesView.class)
    private Book book;

    //movie
    @OneToOne(mappedBy = "resource")
    @JsonView(Views.ResourcesView.class)
    private Movie movie;

    //audiobook
    @OneToOne(mappedBy = "resource")
    @JsonView(Views.ResourcesView.class)
    private Audiobook audiobook;

}
