package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.util.Date;

@Entity
@Table(name = "Konto")
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_konto"
    )
    @JsonView(Views.AccountView.class)
    private Long id;

    @Column(name = "data_zalozenia"
    )
    @JsonView(Views.AccountView.class)
    private Date createDate;

    @Column(name = "imie"
    )
    @JsonView(Views.AccountView.class)
    private String name;

    @Column(name = "nazwisko"
    )
    @JsonView(Views.AccountView.class)
    private String surname;


}
