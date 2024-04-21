package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Customer;
import pl.edu.vistula.s61988.service.CustomerService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService czytelnikService;

    @GetMapping("/clients")
    @JsonView(Views.CustomerView.class)
    @CrossOrigin
    public List<Customer> getAllClients() {
        return czytelnikService.getAllClients();
    }
}
