package pl.edu.vistula.s61988.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Film")
@Getter
@Setter
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_film"
    )
    private Long id;

    private String nazwa;
    private String opis;
    private int dlugosc;
}
