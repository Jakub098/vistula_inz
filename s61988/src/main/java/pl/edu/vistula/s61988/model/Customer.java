package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;


@Entity
@Table(name = "Czytelnik")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_czytelnik"
    )
    @JsonView({Views.CustomerView.class, Views.HireView.class})
    private Long id;

    @Column(name = "numer_karty"
    )
    @JsonView(Views.CustomerView.class)
    private String cardNumber;

    @OneToMany(mappedBy = "customer")
    private List<Hire> hires;

}
