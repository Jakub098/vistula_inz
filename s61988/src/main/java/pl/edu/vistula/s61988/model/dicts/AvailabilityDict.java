package pl.edu.vistula.s61988.model.dicts;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.model.Account;
import pl.edu.vistula.s61988.model.Resources;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@Entity
@Table(name = "Status_aktywnosci_dict")
@Getter
@Setter
public class AvailabilityDict {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_status_aktywnosci"
    )
    @JsonView({Views.AvailabilityDictView.class, Views.AccountView.class, Views.ResourcesView.class})
    private Long id;

    @Column(name = "nazwa"
    )
    @JsonView({Views.AvailabilityDictView.class, Views.AccountView.class, Views.ResourcesView.class})
    private String name;

    @OneToMany(mappedBy = "availabilityStatus")
    private List<Account> accounts;

    @OneToMany(mappedBy = "availabilityStatus")
    private List<Resources> resources;
}
