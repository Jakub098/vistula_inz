package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Book;
import pl.edu.vistula.s61988.repository.BookRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository ksiazkaRepository;

    public List<Book> getAllBooks() {
        return ksiazkaRepository.findAll();
    }
}
