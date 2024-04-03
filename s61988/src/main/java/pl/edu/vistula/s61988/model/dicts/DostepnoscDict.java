package pl.edu.vistula.s61988.model.dicts;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.model.Zasoby;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@Entity
@Table(name = "Dostepnosc_dict")
@Getter
@Setter
public class DostepnoscDict {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dostepnosc"
    )
    @JsonView(Views.DostepnoscDictView.class)
    private Long id;

    @JsonView(Views.DostepnoscDictView.class)
    private String nazwa;

    @OneToMany(mappedBy = "dostepnosc")
    private List<Zasoby> zasoby;

}
