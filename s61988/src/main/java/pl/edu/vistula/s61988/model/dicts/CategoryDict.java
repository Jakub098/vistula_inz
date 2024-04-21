package pl.edu.vistula.s61988.model.dicts;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

@Entity
@Table(name = "Kategoria_dict")
@Getter
@Setter
public class CategoryDict {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kategoria"
    )
    @JsonView(Views.CategoryDictView.class)
    private Long id;

    @Column(name = "nazwa"
    )
    @JsonView(Views.CategoryDictView.class)
    private String name;

}
