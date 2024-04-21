package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Book;
import pl.edu.vistula.s61988.service.BookService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BookController {

    private final BookService ksiazkaService;

    @GetMapping("/books")
    @JsonView(Views.BookView.class)
    @CrossOrigin
    public List<Book> getAllBooks() {
        return ksiazkaService.getAllBooks();
    }
}
