package pl.edu.vistula.s61988.model;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.vistula.s61988.views.Views;

@Entity
@Table(name = "Audiobook")
@Getter
@Setter
public class Audiobook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_audiobook"
    )
    @JsonView(Views.AudiobookView.class)
    private Long id;

    @Column(name = "ilosc_plyt"
    )
    @JsonView(Views.AudiobookView.class)
    private Long totalCd;

    @OneToOne
    @JoinColumn(name = "id_audiobook")
    private Resources resource;

}
