package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@Entity
@Table(name = "Pracownik")
@Getter
@Setter
public class Pracownik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pracownik"
    )
    @JsonView(Views.PracownikView.class)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_konto", nullable = false)
    private Konto employeeAccount;

    @OneToMany(mappedBy = "employee")
    private List<Wypozyczenie> wypozyczenia;



}
