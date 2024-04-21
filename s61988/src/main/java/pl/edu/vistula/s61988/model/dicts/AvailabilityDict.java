package pl.edu.vistula.s61988.model.dicts;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

@Entity
@Table(name = "Status_aktywnosci_dict")
@Getter
@Setter
public class AvailabilityDict {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_status_aktywnosci"
    )
    @JsonView(Views.AvailabilityDictView.class)
    private Long id;

    @Column(name = "nazwa"
    )
    @JsonView(Views.AvailabilityDictView.class)
    private String name;


}
