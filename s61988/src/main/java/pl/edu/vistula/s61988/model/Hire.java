package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.util.Date;

@Entity
@Table(name = "Wypozyczenie")
@Getter
@Setter
public class Hire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_wypozyczenie"
    )
    @JsonView(Views.HireView.class)
    private Long id;

    @Column(name = "data_wypozyczenia"
    )
    @JsonView(Views.HireView.class)
    private Date rentDate;

    @Column(name = "data_zwrotu"
    )
    @JsonView(Views.HireView.class)
    private Date returnDate;

    @ManyToOne
    @JoinColumn(name = "id_zasob", nullable = false)
    @JsonView(Views.HireView.class)
    private Resources resource;

    @ManyToOne
    @JoinColumn(name = "id_pracownik", nullable = false)
    @JsonView(Views.HireView.class)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "id_czytelnik", nullable = false)
    @JsonView(Views.HireView.class)
    private Customer customer;

}
