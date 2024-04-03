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
public class Czytelnik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_czytelnik"
    )
    @JsonView(Views.CzytelnikView.class)
    private Long id;

    @Column(name = "numer_karty"
    )
    @JsonView(Views.CzytelnikView.class)
    private String cardNumber;

    @ManyToOne
    @JoinColumn(name = "id_konto", nullable = false)
    private Konto clientAccount;

    @OneToMany(mappedBy = "czytelnik")
    private List<Wypozyczenie> wypozyczenia;


}
