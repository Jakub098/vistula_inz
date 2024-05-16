package pl.edu.vistula.s61988.model.dicts;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.model.Resources;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@Entity
@Table(name = "Kategoria_dict")
@Getter
@Setter
public class CategoryDict {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kategoria"
    )
    @JsonView({Views.CategoryDictView.class, Views.ResourcesView.class})
    private Long id;

    @Column(name = "nazwa"
    )
    @JsonView({Views.CategoryDictView.class, Views.ResourcesView.class})
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Resources> resources;

}
