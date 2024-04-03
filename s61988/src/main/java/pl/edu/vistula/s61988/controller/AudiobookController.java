package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Audiobook;
import pl.edu.vistula.s61988.service.AudiobookService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AudiobookController {

    private final AudiobookService audiobookService;

    @GetMapping("/audiobooks")
    @JsonView(Views.AudiobookView.class)
    public List<Audiobook> getAllAudiobooks() {
        return audiobookService.getAllAudiobooks();
    }
}
