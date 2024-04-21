package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

@Entity
@Table(name = "Pracownik")
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pracownik"
    )
    @JsonView(Views.EmployeeView.class)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_konto", nullable = false)
    private Account employeeAccount;

}
