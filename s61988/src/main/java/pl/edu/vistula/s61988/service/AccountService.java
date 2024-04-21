package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Account;
import pl.edu.vistula.s61988.repository.AccountRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository kontoRepository;

    public List<Account> getAllAccounts() {
        return kontoRepository.findAll();
    }
}
