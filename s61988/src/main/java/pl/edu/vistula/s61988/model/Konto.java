package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Konto")
@Getter
@Setter
public class Konto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_konto"
    )
    @JsonView(Views.KontoView.class)
    private Long id;

    @Column(name = "data_zalozenia"
    )
    @JsonView(Views.KontoView.class)
    private Date createDate;

    @Column(name = "imie"
    )
    @JsonView(Views.KontoView.class)
    private String name;

    @Column(name = "nazwisko"
    )
    @JsonView(Views.KontoView.class)
    private String surname;

    @OneToMany(mappedBy = "clientAccount")
    private List<Czytelnik> clients;

    @OneToMany(mappedBy = "employeeAccount")
    private List<Pracownik> employees;

}
