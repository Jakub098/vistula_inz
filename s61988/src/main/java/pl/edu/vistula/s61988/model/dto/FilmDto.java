package pl.edu.vistula.s61988.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmDto {

    private String nazwa;
    private String opis;
    private int dlugosc;

}
