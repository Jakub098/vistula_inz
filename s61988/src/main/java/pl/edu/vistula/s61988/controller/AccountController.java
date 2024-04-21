package pl.edu.vistula.s61988.controller;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.vistula.s61988.model.Account;
import pl.edu.vistula.s61988.service.AccountService;
import pl.edu.vistula.s61988.views.Views;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService kontoService;

    @GetMapping("/accounts")
    @JsonView(Views.AccountView.class)
    @CrossOrigin
    public List<Account> getAllAccounts() {
        return kontoService.getAllAccounts();
    }
}
