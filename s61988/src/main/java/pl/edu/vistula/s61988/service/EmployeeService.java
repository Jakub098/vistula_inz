package pl.edu.vistula.s61988.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.edu.vistula.s61988.model.Employee;
import pl.edu.vistula.s61988.repository.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository pracownikRepository;

    public List<Employee> getAllEmployees() {
        return pracownikRepository.findAll();
    }
}
