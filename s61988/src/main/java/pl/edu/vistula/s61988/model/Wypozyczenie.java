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
public class Wypozyczenie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_wypozyczenie"
    )
    @JsonView(Views.WypozyczenieView.class)
    private Long id;

    @Column(name = "data_wypozyczenia"
    )
    @JsonView(Views.WypozyczenieView.class)
    private Date rentDate;

    @Column(name = "data_zwrotu"
    )
    @JsonView(Views.WypozyczenieView.class)
    private Date returnDate;

    @ManyToOne
    @JoinColumn(name = "id_zasob", nullable = false)
    private Zasoby zasob;

    @ManyToOne
    @JoinColumn(name = "id_pracownik", nullable = false)
    private Pracownik pracownik;

    @ManyToOne
    @JoinColumn(name = "id_czytelnik", nullable = false)
    private Czytelnik czytelnik;


}
