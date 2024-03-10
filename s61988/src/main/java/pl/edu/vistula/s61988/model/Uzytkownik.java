package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@Entity
@Table(name = "Uzytkownik")
@Getter
@Setter
public class Uzytkownik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_uzytkownik"
    )
    @JsonView(Views.UserView.class)
    private Long id;

    @JsonView(Views.UserView.class)
    private String email;

    @JsonView(Views.UserView.class)
    private String imie;

    @JsonView(Views.UserView.class)
    private String nazwisko;

    @OneToMany(mappedBy = "user")
    private List<Rezerwacja> users;

}
